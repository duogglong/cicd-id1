FROM openjdk:8

COPY target/spring-demo.jar spring-demo.jar

ENTRYPOINT ["java", "-jar", "/spring-demo.jar"]