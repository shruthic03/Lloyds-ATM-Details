FROM openjdk:11
COPY out/artifacts/LloydsATMDetails_jar/LloydsATMDetails.jar ./
WORKDIR out/artifacts/LloydsATMDetails_jar
CMD ["java", "-jar", "LloydsATMDetails.jar"]