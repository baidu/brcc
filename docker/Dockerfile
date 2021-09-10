FROM openjdk:8-jre-alpine
LABEL maintainer="fkzhao@outlook.com"

RUN echo "export TZ='Asia/Shanghai'" >> /root/.bashrc && \
    echo "Asia/shanghai" > /etc/timezone && \
    ln -sf /usr/share/zoneinfo/Asia/Shanghai /etc/localtime \

USER root

ARG module
ENV ENV_MODULE=${module}
CMD mkdir -p /home/work

ADD ${module} /home/work/${module}

WORKDIR /home/work/${module}
RUN chmod +x /home/work/${module}/bin/start.sh

ENTRYPOINT sh /home/work/${ENV_MODULE}/bin/start.sh
