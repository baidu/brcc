/*
 * @Author: Malin Xie
 * @Description:
 * @Date: 2021-06-10 20:53:33
 */
package rcc

const (
	TestConfFile = "./testdata/rcc.toml"

	// mapping from confFile content
	projectName      = "brcc-go-sdk"
	envName          = "dev"
	versionName      = "1.0"
	apiPassword      = "123456"
	serverUrl        = "localhost"
	enableCallback   = true
	callbackInterval = 1
	requestTimeout   = 2
	enableCache      = true

	// Mock info
	AuthAPI = "api/auth" //Post
	Token   = "f4fef7cd9fd143eb8c806c0506dd6ffd"

	EnvAPI        = "api/environment" //Get
	EnvironmentId = 52

	VerionAPI = "api/version" //Get
	VersionId = 53
	CheckSum  = "ace54738-9362-40c4-8eeb-98717a802aac"

	ItemAPI   = "api/item" //Get
	EmptyItem = "[]"
	OneItem   = `[{"key":"mykey", "value":"myvalue"}]`
	C_Key1    = "mykey"
	C_Value1  = "myvalue"

	GroupId = 481
)
