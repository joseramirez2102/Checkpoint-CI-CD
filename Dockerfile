FROM openjdk:17-alpine
EXPOSE 8081
ADD target/ci_cd-checkpoint.jar ci_cd-checkpoint.jar
ENTRYPOINT [ "java", "-jar", "ci_cd-checkpoint.jar"]