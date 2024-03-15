FROM eclipse-temurin:17
COPY target/first.jar first.jar
CMD ["java","-jar","first.jar"]