# MicroServiceArchitecture
this is MicroServiceArchitecture

## micro Service 실습을 위한 패키지 구조 구성함

1. Gradle Multi Module 방식으로 구성함
2. 루트 모듈에서 Docker 빌드시 하위 모듈도 연쇄적으로 Docker 빌드가 발생하도록 설정함
3. 하위 모듈에서 build.gradle에 대한 도커 빌드에 대한 구현 및 Dockerfile 구성
4. 도커 빌드시 먼저 task가 동작하고 이후에 Dockerfile을 읽는 구조로 Docker 이미지를 만듬
5. 루트 모듈에서 docker-compose.yml에 마이크로서비스에 대한 배포정책에 대한 실행 스크립트를 작성
6. docker-compose.yml 실행시 루트모듈에서 도커빌드 실행할 때 만들어진 도커이미지들을 컨테이너로 생성하고 관계를 맺는다.

## 실행명령어
```
# 루트모듈에서 하위 모듈 도커이미지 생성하는 명령어
$ ./gradlew user-service:docker
```

```어
# 루트모듈에서 docker-compose.yml 스크립트 실행 명령
docker-compose -f docker/common/docker-compose.yml up
```


