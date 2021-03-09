FROM java:8

EXPOSE 8080

WORKDIR /spring-boot-mockito

RUN echo "PWD is: $PWD"

ADD /spring-boot-mockito/target/spring-boot-mockito-0.0.1-SNAPSHOT.jar spring-boot-mockito-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java", "-jar", "spring-boot-mockito-0.0.1-SNAPSHOT.jar"]
