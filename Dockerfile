FROM openjdk:17-jdk

WORKDIR /app
COPY target/cloud_lab-3.1.5.jar /app/cloud_lab-3.1.5.jar

CMD ["java", "-jar", "cloud_lab-3.1.5.jar"]