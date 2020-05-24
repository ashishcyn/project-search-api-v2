FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} project-search-api.jar
ENTRYPOINT ["java","-jar","/project-search-api.jar"]
