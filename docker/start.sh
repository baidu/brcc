#! /bin/bash
app="brcc-server"
APPLICATION=/home/work/${app}/lib/${app}.jar
MAX_MEMORY=1024M

if [ "$SERVER_PORT" != "" ]; then
    JAVA_OPT="$JAVA_OPT -Dserver.port=$SERVER_PORT"
fi
if [ "$REDIS_HOST" != "" ]; then
    JAVA_OPT="$JAVA_OPT -Dredis.host=$REDIS_HOST"
fi
if [ "$REDIS_PASSWORD" != "" ]; then
    JAVA_OPT="$JAVA_OPT -Dspring.redis.password=$REDIS_PASSWORD"
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

# shellcheck disable=SC2086
java -Xmx${MAX_MEMORY} -jar ${JAVA_OPT} ${APPLICATION}