FROM openjdk:8
MAINTAINER WebHooker
COPY target/ViberWebHookReceiver.jar /home/ViberWebHookReceiver.jar
EXPOSE 8080
CMD ["java","-Dspring.profiles.active=prod,db_prod","-jar","/home/ViberWebHookReceiver.jar"]