package rcc

import (
	"errors"
	"reflect"
	"strconv"
)

const (
	bindKeyTag     = "rcc"
	bindDefaultTag = "rcc_default"
)

type clientI interface {
	GetValue(key, defaultValue string) string
}

// binding
// inject value into struct from kv storage client
func binding(s interface{}, client clientI) error {
	sType := reflect.TypeOf(s)
	sStructType := sType.Elem()
	sStructVal := reflect.ValueOf(s).Elem()
	if sType.Kind() != reflect.Ptr && sStructType.Kind() != reflect.Struct {
		return errors.New("binding param must be struct")
	}
	fieldNum := sStructType.NumField()
	for i := 1; i <= fieldNum; i = i + 1 {
		field := sStructType.Field(i - 1)
		if key, ok := field.Tag.Lookup(bindKeyTag); ok {
			var fieldVal string
			if defaultVal, ok := field.Tag.Lookup(bindDefaultTag); ok {
				fieldVal = client.GetValue(key, defaultVal)
			} else {
				fieldVal = client.GetValue(key, "")
			}
			newFieldVal, err := convert(field.Type.Kind(), fieldVal)
			if err != nil {
				return err
			}
			sStructVal.Field(i - 1).Set(reflect.ValueOf(newFieldVal))
		}
	}
	return nil
}

// convert
// format string val to appoint kind type
func convert(k reflect.Kind, val string) (interface{}, error) {
	switch k {
	case reflect.Bool:
		return strconv.ParseBool(val)
	case reflect.String:
		return val, nil
	case reflect.Int:
		intret, err := strconv.ParseInt(val, 10, 32)
		return int(intret), err
	case reflect.Int8:
		int8ret, err := strconv.ParseInt(val, 10, 8)
		return int8(int8ret), err
	case reflect.Int16:
		int16ret, err := strconv.ParseInt(val, 10, 16)
		return int16(int16ret), err
	case reflect.Int32:
		int32ret, err := strconv.ParseInt(val, 10, 32)
		return int32(int32ret), err
	case reflect.Int64:
		return strconv.ParseInt(val, 10, 64)
	case reflect.Uint:
		uintret, err := strconv.ParseUint(val, 10, 32)
		return uint(uintret), err
	case reflect.Uint8:
		uint8ret, err := strconv.ParseUint(val, 10, 8)
		return uint8(uint8ret), err
	case reflect.Uint16:
		uint16ret, err := strconv.ParseUint(val, 10, 16)
		return uint16(uint16ret), err
	case reflect.Uint32:
		uint32ret, err := strconv.ParseUint(val, 10, 32)
		return uint32(uint32ret), err
	case reflect.Uint64:
		return strconv.ParseUint(val, 10, 64)
	case reflect.Uintptr:
		uint32ret, err := strconv.ParseUint(val, 10, 32)
		return uintptr(uint32ret), err
	case reflect.Float32:
		float32ret, err := strconv.ParseFloat(val, 32)
		return float32(float32ret), err
	case reflect.Float64:
		return strconv.ParseFloat(val, 64)
		// support in 1.15
		// case reflect.Complex64:
		// 	complex64ret, err := strconv.ParseComplex(val, 64)
		// 	return complex64(complex64ret), err
		// case reflect.Complex128:
		// 	return strconv.ParseComplex(val, 128)
	}
	return val, errors.New("only support basic type")
}
