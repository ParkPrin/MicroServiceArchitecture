FROM openjdk:8-jdk-alpine
RUN  apk update && apk upgrade && apk add netcat-openbsd
RUN mkdir -p /usr/local/licensing-service
ADD libs /usr/local/licensing-service/libs
RUN chmod a+rx -R /usr/local/licensing-service/libs
WORKDIR /usr/local/licensing-service/libs
CMD ./run.sh