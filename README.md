# Demo web application using Quarkus framework

## Start application in dev mode
```bash
./mvnw compile quarkus:dev
```

## Run Tests
```bash
./mvnw test
```

## Build and run in Open JDK JVM
```bash
./mvnw package
docker build -f src/main/docker/Dockerfile.jvm -t quarkus/quarkus-demo-jvm .
docker run -i --rm -p 8080:8080 quarkus/quarkus-demo-jvm
```

## Build and run in native VM
```bash
./mvnw package -Pnative -Dquarkus.native.container-build=true
docker build -f src/main/docker/Dockerfile.native -t quarkus/quarkus-demo .
docker run -i --rm -p 8080:8080 quarkus/quarkus-demo
```