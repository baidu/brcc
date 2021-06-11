package rcc

import (
	"fmt"
	"reflect"
	"testing"

	"github.com/stretchr/testify/assert"
)

type clientTest int

func (c clientTest) GetValue(key, defaultValue string) string {
	return cases[key].value
}

type testCase struct {
	kind  reflect.Kind
	value string
}

var cases = map[string]testCase{
	"Bool":    {kind: reflect.Bool, value: "true"},
	"Int":     {kind: reflect.Int, value: "1"},
	"Int8":    {kind: reflect.Int8, value: "2"},
	"Int16":   {kind: reflect.Int16, value: "3"},
	"Int32":   {kind: reflect.Int32, value: "4"},
	"Int64":   {kind: reflect.Int64, value: "5"},
	"Uint":    {kind: reflect.Uint, value: "1"},
	"Uint8":   {kind: reflect.Uint8, value: "2"},
	"Uint16":  {kind: reflect.Uint16, value: "3"},
	"Uint32":  {kind: reflect.Uint32, value: "4"},
	"Uint64":  {kind: reflect.Uint64, value: "5"},
	"Uintptr": {kind: reflect.Uintptr, value: "8004000"},
	"Float32": {kind: reflect.Float32, value: "3.0"},
	"Float64": {kind: reflect.Float64, value: "6.0"},
	// "Complex64":  {kind: reflect.Complex64, value: "5+1i"},
	// "Complex128": {kind: reflect.Complex128, value: "100+10i"},
	"String": {kind: reflect.String, value: "string"},
}

func TestBinding(t *testing.T) {
	type Test struct {
		Bool    bool    `rcc:"Bool"`
		Int     int     `rcc:"Int"`
		Int8    int8    `rcc:"Int8"`
		Int16   int16   `rcc:"Int16"`
		Int32   int32   `rcc:"Int32"`
		Int64   int64   `rcc:"Int64"`
		Uint    uint    `rcc:"Uint"`
		Uint8   uint8   `rcc:"Uint8"`
		Uint16  uint16  `rcc:"Uint16"`
		Uint32  uint32  `rcc:"Uint32"`
		Uint64  uint64  `rcc:"Uint64"`
		Uintptr uintptr `rcc:"Uintptr"`
		Float32 float32 `rcc:"Float32"`
		Float64 float64 `rcc:"Float64"`
		// Complex64  complex64  `rcc:"Complex64"`
		// Complex128 complex128 `rcc:"Complex128"`
		String string `rcc:"String"`
	}
	var val interface{}
	tv := Test{}
	c := clientTest(1)

	err := binding(&tv, c)
	fmt.Println(tv)
	assert.NoError(t, err)

	for key, item := range cases {
		val, err = convert(item.kind, item.value)
		assert.NoError(t, err)
		field := reflect.ValueOf(tv).FieldByName(key)
		assert.Equal(t, field.Interface(), val)
	}
}
