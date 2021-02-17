FROM openjdk:8-jdk-alpine
RUN  apk update && apk upgrade && apk add netcat-openbsd
RUN mkdir -p /usr/local/user-service
ADD libs /usr/local/user-service/libs
RUN chmod a+rx -R /usr/local/user-service/libs
WORKDIR /usr/local/user-service/libs
CMD ./run.sh