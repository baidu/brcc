package rcc

import (
	"os"
	"testing"

	. "github.com/smartystreets/goconvey/convey"
)

const testfile = "./testdata/cache.data"

// tempfile returns a temporary file path.
func Tempfile() error {
	_, err := os.Create(testfile)
	return err
}

// DeleteTempFile delete temp file for test
func DeleteTempFile() error {
	err := os.Remove(testfile)
	if err != nil {
		return err
	}
	return nil
}

// TestCacheLoadStore test load and store from local test file
func TestCacheLoadStore(t *testing.T) {
	Tempfile()
	defer DeleteTempFile()

	Convey("test cache store and load", t, func() {
		cache := newCache()
		cache.set("key1", "value1")

		err := cache.store(testfile)
		So(err, ShouldBeNil)

		cache2 := newCache()
		err = cache2.load(testfile)
		So(err, ShouldBeNil)

		v1, b1 := cache.get("key1")
		v2, b2 := cache2.get("key1")
		So(v1, ShouldEqual, v2)
		So(b1, ShouldEqual, b2)
	})

}
