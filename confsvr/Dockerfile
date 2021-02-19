FROM openjdk:8-jdk-alpine
RUN apk update && apk upgrade && apk add netcat-openbsd && apk add curl && apk add wget
RUN mkdir -p /usr/local/configserver && \
    cd /tmp/ && \
    wget 'http://download.oracle.com/otn-pub/java/jce/8/jce_policy-8.zip' --header "Cookie: oraclelicense=accept-securebackup-cookie" && \
    chmod a+rx -R /tmp/ && \
    unzip jce_policy-8.zip && \
    rm jce_policy-8.zip && \
    yes |cp -v /tmp/UnlimitedJCEPolicyJDK8/*.jar /usr/lib/jvm/java-1.8-openjdk/jre/lib/security/
ADD libs /usr/local/configserver/libs
RUN chmod a+rx -R /usr/local/configserver/libs
WORKDIR /usr/local/configserver/libs
CMD ./run.sh