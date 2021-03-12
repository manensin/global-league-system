# Get JDK 8 image
FROM adoptopenjdk/openjdk8

ARG JAR_FILE=target/global-league-system.jar

# cp global-league-system.jar to container image.
COPY ${JAR_FILE} global-league-system.jar
EXPOSE 8082
# java -jar global-league-system.jar
ENTRYPOINT ["java","-jar","global-league-system.jar"]