package rcc

import (
	"fmt"
	"net/url"
	"strings"
)


func httpUrl(ipOrAddr string) string {
	if strings.HasPrefix(ipOrAddr, "http://") || strings.HasPrefix(ipOrAddr, "https://") {
		return ipOrAddr
	}

	return fmt.Sprintf("http://%s", ipOrAddr)
}

func requestTokenUrl(conf *Conf) string {
	return fmt.Sprintf("%s/api/auth",
		httpUrl(conf.ServerUrl))
}

func apiEnvironment(conf *Conf) string {
	return fmt.Sprintf("%s/api/environment/%s?token=%s",
		httpUrl(conf.ServerUrl),
		url.QueryEscape(conf.EnvName),
		url.QueryEscape(conf.Token))
}

func apiVersion(conf *Conf) string {
	return fmt.Sprintf("%s/api/version/%s?token=%s&environmentId=%d&versionName=%s",
		httpUrl(conf.ServerUrl),
		url.QueryEscape(conf.VersionName),
		url.QueryEscape(conf.Token),
		conf.EnvId,
		url.QueryEscape(conf.VersionName),
	)
}

func apiItems(conf *Conf, versionId int) string {
	return fmt.Sprintf("%s/api/item?token=%s&versionId=%d",
		httpUrl(conf.ServerUrl),
		url.QueryEscape(conf.Token),
		versionId)
}
