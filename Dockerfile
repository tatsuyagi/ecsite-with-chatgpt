FROM openjdk:17.0.2-slim
COPY target/*.jar app.jar
ENTRYPOINT ["java","--enable-preview","-jar","/app.jar"]
