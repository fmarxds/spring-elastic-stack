FROM openjdk:11.0.12-jre-slim-buster
RUN mkdir /app
COPY /build/libs/*.jar /app/app.jar
EXPOSE 5000
ENTRYPOINT ["java", "-jar", "/app/app.jar"]

################################################
########## BUILD INSIDE CONTAINER ##############

#FROM openjdk:11.0.12-jre-slim-buster
#
#RUN mkdir /app
#
#COPY /gradle /app/gradle
#COPY /src /app/src
#COPY build.gradle.kts /app/
#COPY gradlew /app/
#COPY gradlew.bat /app/
#COPY settings.gradle.kts /app/
#
#WORKDIR /app
#
#RUN ./gradlew clean build
#RUN cp /app/build/libs/*.jar /app/app.jar
#
#EXPOSE 5000
#
#ENTRYPOINT ["java", "-jar", "/app/app.jar"]