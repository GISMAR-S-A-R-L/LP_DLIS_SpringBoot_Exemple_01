FROM openjdk:11
LABEL maintainer="app_springBoot_iutv"
ADD target/exemple_01-0.0.1-SNAPSHOT.jar springboot_exemple_01.jar
ENTRYPOINT ["java", "-jar", "springboot_exemple_01.jar"]