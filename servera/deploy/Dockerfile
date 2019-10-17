FROM 10.216.70.22:7443/common/java-font:8-jre-alpine

ADD servera/target/servera.jar /servera.jar

ENTRYPOINT ["java", "-jar", "/servera.jar"]
