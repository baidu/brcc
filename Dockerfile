FROM openjdk:8-jre-alpine

ADD start.sh start.sh

ADD brcc-server/target/*.jar ./brcc-server/target/brcc-server.jar

EXPOSE 8088

RUN chmod 755 start.sh

ENTRYPOINT ["./start.sh"]

