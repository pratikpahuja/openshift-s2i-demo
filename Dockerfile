#base image of open jdk
FROM openjdk

#copying jar into image
COPY target/spring-boot-web-0.0.1-SNAPSHOT.jar /

#default command to execute once image is deployed on container
CMD java -jar /spring-boot-web-0.0.1-SNAPSHOT.jar