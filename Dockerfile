FROM openjdk:8-alpine

COPY target/uberjar/hamkok.jar /hamkok/app.jar

EXPOSE 3000

CMD ["java", "-jar", "/hamkok/app.jar"]
