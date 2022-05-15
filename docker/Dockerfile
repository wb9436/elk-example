FROM daocloud.io/library/java:8u40-jdk
COPY ./elk-example.jar /usr/local
WORKDIR /usr/local
RUN /bin/cp /usr/share/zoneinfo/Asia/Shanghai /etc/localtime && echo 'Asia/Shanghai' >/etc/timezone
CMD java -jar elk-example.jar