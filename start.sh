#!/bin/bash

JAVA_FILE=./brcc-server/target/brcc-server.jar
PID=$(jps -ml | grep "$JAVA_FILE" | awk '{print $1}')
if [ "$PID" != "" ] ; then
        echo "will kill the pid $PID"
        kill -9 $PID;
fi
sleep 5

# set your web port
# SERVER_PORT=8080

# SET YOUR REDIS ENVIRONMENT
# REDIS_HOST=x.x.x.x
# REDIS_PORT=6379
# REDIS_PASSWORD=xxx

# SET YOUR MYSQL ENVIRONMENT
# DB_HOST=x.x.x.x
# DB_PORT=3306
# DB_USERNAME=xxx
# DB_PASSWORD=xxx

if [ "$SERVER_PORT" != "" ]; then
    JAVA_OPT="$JAVA_OPT -Dserver.port=$SERVER_PORT"
fi
if [ "$REDIS_HOST" != "" ]; then
    JAVA_OPT="$JAVA_OPT -Dredis.host=$REDIS_HOST"
fi
if [ "$REDIS_PASSWORD" != "" ]; then
    JAVA_OPT="$JAVA_OPT -Dspring.redis.password=$REDIS_PASSWORD"
fi
if [ "$REDIS_PORT" != "" ]; then
    JAVA_OPT="$JAVA_OPT -Dredis.port=$REDIS_PORT"
fi
if [ "$REDIS_PASSWORD" != "" ]; then
    JAVA_OPT="$JAVA_OPT -Dredis.password=$REDIS_PASSWORD"
fi
if [ "$DB_HOST" != "" ]; then
    JAVA_OPT="$JAVA_OPT -Ddb.host=$DB_HOST"
fi
if [ "$DB_PORT" != "" ]; then
    JAVA_OPT="$JAVA_OPT -Ddb.port=$DB_PORT"
fi
if [ "$DB_USERNAME" != "" ]; then
    JAVA_OPT="$JAVA_OPT -Ddb.username=$DB_USERNAME"
fi
if [ "$DB_PASSWORD" != "" ]; then
    JAVA_OPT="$JAVA_OPT -Ddb.password=$DB_PASSWORD"
fi
nohup java -jar $JAVA_OPT $JAVA_FILE 1>/dev/null 2>&1 &
