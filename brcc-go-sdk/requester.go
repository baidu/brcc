package rcc

import (
	"bytes"
	"context"
	"encoding/json"
	"fmt"
	"io/ioutil"
	"net/http"

	"github.com/baidu/brcc/brcc-go-sdk/logutil"
	"go.uber.org/zap"
)

// this is a static check
var _ IRequester = (*httpRequester)(nil)

// IRequester
type IRequester interface {
	Get(url string, respData interface{}) error
	Post(url string, data interface{}, respData interface{}) error
	Delete(url string, respData interface{}) error
}

type httpRequester struct {
	ctx    context.Context
	client *http.Client
}

func newHTTPRequester(ctx context.Context, client *http.Client) IRequester {
	return &httpRequester{
		ctx:    ctx,
		client: client,
	}
}

// Get
func (r *httpRequester) Get(url string, respData interface{}) error {
	resp, err := r.client.Get(url)
	response := &ApiResponse{
		Data: respData,
	}
	return r.procRsp(resp, err, response)
}

// Post
func (r *httpRequester) Post(url string, data interface{}, respData interface{}) error {

	jsonData, _ := json.Marshal(data)
	buffer := bytes.NewBuffer(jsonData)

	resp, err := r.client.Post(url, "application/json;charset=UTF-8", buffer)
	response := &ApiResponse{
		Data: respData,
	}
	return r.procRsp(resp, err, response)
}

// Post2
func (r *httpRequester) Post2(url string, data interface{}, Headers map[string]string, respData interface{}) error {
	jsonData, _ := json.Marshal(data)
	buffer := bytes.NewBuffer(jsonData)
	req, _ := http.NewRequest("POST", url, buffer)
	req.Header.Set("Content-Type", "application/json;charset=UTF-8")
	for key, val := range Headers {
		req.Header.Set(key, val)
	}

	resp, err := r.client.Do(req)
	response := &ApiResponse{
		Data: respData,
	}
	return r.procRsp(resp, err, response)
}

// Put
func (r *httpRequester) Put(url string, data interface{}, respData interface{}) error {
	jsonData, _ := json.Marshal(data)
	buffer := bytes.NewBuffer(jsonData)
	req, _ := http.NewRequest("PUT", url, buffer)
	req.Header.Set("Content-Type", "application/json;charset=UTF-8")
	resp, err := r.client.Do(req)
	response := &ApiResponse{
		Data: respData,
	}
	return r.procRsp(resp, err, response)
}

// Delete
func (r *httpRequester) Delete(url string, respData interface{}) error {
	req, _ := http.NewRequest("DELETE", url, nil)

	resp, err := r.client.Do(req)
	response := &ApiResponse{
		Data: respData,
	}
	return r.procRsp(resp, err, response)
}

type ApiResponse struct {
	Status int         `json:"status"`
	Msg    string      `json:"msg"`
	Data   interface{} `json:"data"`
}

func (r *httpRequester) procRsp(resp *http.Response, err error, response *ApiResponse) error {
	if err != nil {
		errorString := fmt.Sprintf("rcc server resp error %s", err)
		logutil.DefaultLogger().Warn(errorString)
		return fmt.Errorf(errorString)
	}
	defer resp.Body.Close()

	if resp.StatusCode != http.StatusOK {
		// Discard all body if status code is not 200
		bodyBytes, _ := ioutil.ReadAll(resp.Body)
		errorString := fmt.Sprintf("rcc server resp code not ok, method=%s, url=%s, code=%d, body=%s",
			resp.Request.Method, resp.Request.URL.Path, resp.StatusCode, bodyBytes)
		logRspError(errorString, resp)
		return fmt.Errorf(errorString)
	}

	bodyBytes, err := ioutil.ReadAll(resp.Body)
	if err != nil {
		errorString := fmt.Sprintf("procRsp ioutil.ReadAll error, method=%s, url=%s, code=%d, error=%s",
			resp.Request.Method, resp.Request.URL.Path, resp.StatusCode, err)
		logRspError(errorString, resp)
		return fmt.Errorf(errorString)
	}

	err = json.Unmarshal(bodyBytes, response)
	if err != nil {
		errorString := fmt.Sprintf("procRsp json.Unmarshal error, method=%s, url=%s, code=%d, body=%s, error=%s",
			resp.Request.Method, resp.Request.URL.Path, resp.StatusCode, bodyBytes, err)

		logRspError(errorString, resp)
		return fmt.Errorf(errorString)
	}

	if response.Status != 0 {
		errorString := fmt.Sprintf("rcc response status not zero, method=%s, url=%s, code=%d, body=%s",
			resp.Request.Method, resp.Request.URL.Path, resp.StatusCode, bodyBytes)
		logRspError(errorString, resp)
		return fmt.Errorf(errorString)
	}

	return nil
}

func logRspError(errorString string, resp *http.Response) {
	logutil.DefaultLogger().Warn(errorString,
		zap.String("method", resp.Request.Method),
		zap.String("url", resp.Request.URL.Path),
		zap.Int("status", resp.StatusCode))
}
