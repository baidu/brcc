FROM maven:3.8.6-openjdk-8 as builder
COPY . .
RUN mvn clean package -DskipTests -Dgpg.skip

FROM openjdk:8-jre-alpine
ENV MY_HOME=/app
ARG JAVA_OPTS=""
ENV OPTS=$JAVA_OPTS

COPY --from=builder brcc-server/target/*.jar $MY_HOME/app.jar
WORKDIR $MY_HOME
EXPOSE 8088
RUN apk add --update ttf-dejavu fontconfig
ENTRYPOINT ["sh","-c","java $OPTS -Djava.security.egd=file:/dev/urandom -jar app.jar"]
