FROM openjdk:17
COPY target/sboot-app*.jar /sboot-app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/sboot-app.jar"]
