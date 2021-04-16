package logutil

import (
	"go.uber.org/zap"
)

var defaultLogger *zap.Logger

// initial logger struct
func InitLog() {
	defaultLogger, _ = zap.NewProduction()
	defer defaultLogger.Sync()
}

// DefaultLogger
func DefaultLogger() *zap.Logger {
	return defaultLogger
}
