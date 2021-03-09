FROM openjdk:8-jre-alpine

ENV MY_HOME=/app

ARG JAVA_OPTS=""

ENV OPTS=$JAVA_OPTS

WORKDIR $MY_HOME

EXPOSE 8088

RUN apk add --update ttf-dejavu fontconfig

ADD brcc-server/target/*.jar $MY_HOME/app.jar

ENTRYPOINT ["sh","-c","java $OPTS -Djava.security.egd=file:/dev/urandom -jar app.jar"]
