FROM openjdk:14-alpine
COPY target/greeting-micronaut-*.jar greeting-micronaut.jar
EXPOSE 8080
CMD ["java", "-Dcom.sun.management.jmxremote", "-Xmx128m", "-jar", "greeting-micronaut.jar"]