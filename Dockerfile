FROM alpine:3.15
RUN apk add --no-cache openjdk11
RUN apk --no-cache add curl
COPY target/app.jar /app/app.jar
WORKDIR /app
ENTRYPOINT ["java","-Dspring.profiles.active=prod","-jar","app.jar"]
