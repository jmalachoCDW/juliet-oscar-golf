FROM openjdk:8
ADD target/joes-sample-artifact.jar joes-sample-artifact.jar
EXPOSE 8085
ENTRYPOINT ["java", "-jar", "joes-sample-artifact.jar"]