## AI DRIVEN APPLICATION:
* Generative AI Powered Application is the integration of Spring AI Framework with Spring Boot Application.
* Integration of Artificial Intelligence and Machine Learning into Spring-based application.
* Spring AI project aims to simplify the development of applications that incorporate artificial intelligence functionality without unnecessary complexity.
* This technique was introduced to help the developers in connecting with LLM for decision-making, solving task etc.

## OBJECTIVE:
Task is to create AI CHATBOT having Java Spring boot application as backend which connects with the AI technologies.

### STEPS implemented in Spring Boot Application:
1. Spring boot application is created with Gradle as build automation tool. Necessary dependencies are added.
2. Properties file:
   * Spring application connects with Open AI's predefined model gpt-4o.
   * Added the necessary configuration properties to connect with Open AI model (baseurl, model name, max-attempts and API key).
     API Key is added as environmental variable. 
   * Configured the necessary LLM Fine Tune options to customize the model response.
3. Controller and Service classes are created. Taken necessary actions to implement the following API endpoints inside these classes.
   * OpenAiChatModel class which has pre-built methods to connect with Open AI Model is used in Service class.
   * Interact with AI functionalities using APIs like AI Model API and Advisors API.
   Two types of API Chat methods are created.
   1. Chat Model - Synchronous which is a blocking one.
       - Response is delivered to the user only when the request sent to predefined model is processed completely.
       - User and Application has to wait until the response is generated fully.
   2. Streaming Chat Model - Asynchronous which is a non-blocking one.
       - Java's Reactive Programming paradigm is applied and Response is returned as Flux/Mono.
       - Reactive-stack web framework, Spring WebFlux supports Reactive Streams.
       - Spring based application forwards the response/event as they happen.
       - Response is delivered as Stream, and it is more interactive.
       - User and Application no need to wait for long time until the response is processed completely.
4. Dockerfile:
   * Dockerfile is added for building a Docker Image out of the application.
   * Dockerized a Spring Boot Application to run it in an isolated environment, i.e. Docker Container.
   * It can be viewed inside the Docker Desktop.