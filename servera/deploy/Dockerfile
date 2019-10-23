FROM harbor.szanba.ren/common/openjdk:8-jre-alpine

ARG profile
ENV profile=$profile
ADD servera/target/servera.jar /servera.jar

ENTRYPOINT ["java", "-jar", "/servera.jar", "--spring.profiles.active=${profile}"]

