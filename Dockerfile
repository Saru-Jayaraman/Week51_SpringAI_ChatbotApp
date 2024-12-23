FROM openjdk:17-jdk-alpine

WORKDIR /app

COPY build/libs/Week51_SpringAI_ChatbotApp-0.0.1-SNAPSHOT.jar /app/week51_springai_chatbotapp-0.0.1-SNAPSHOT.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "/app/week51_springai_chatbotapp-0.0.1-SNAPSHOT.jar"]

# To build and create docker image:
# docker build -t week51_springai_chatbotapp .

# To run docker container:
# docker run -p 8080:8080 --name week51_springai_chatbotapp --env OPEN_AI_API_KEY="add your api key"  week51_springai_chatbotapp:latest

# To run mysql db in docker
# docker run --name mysql-c1 -p 3307:3306 -e MYSQL_ROOT_PASSWORD=root -d mysql:latest