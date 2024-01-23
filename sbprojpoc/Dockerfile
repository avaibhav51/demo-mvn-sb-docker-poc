#directrunwithdefault

FROM openjdk:8-jdk-alpine
EXPOSE 8080
ADD target/sbprojpoc.jar sbprojpoc.jar
ENTRYPOINT [ "java","-jar","sbprojpoc.jar" ]

