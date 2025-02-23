# Spring Boot Kafka Project

This project demonstrates the creation of a scalable and resilient Kafka-based microservices system using Spring Boot. The application consists of a Kafka producer and a Kafka consumer, with integration to save processed data into a MySQL database.

## Features
- **Kafka Producer Microservice**: Streams Wikimedia data into Kafka topics.
- **Kafka Consumer Microservice**: Consumes data from Kafka and saves it into a MySQL database.
- Multi-module project structure to manage producer and consumer services.
- Externalized configuration (topics, Kafka, and database details) for flexibility.
- MySQL integration for data persistence.

## Technologies Used
- **Java 17**: Language used for backend development.
- **Spring Boot 3**: Framework for building the application.
- **Apache Kafka**: Distributed messaging platform for real-time data streaming.
- **MySQL**: Database for storing processed data.
- **Spring Kafka**: Provides easy Kafka integration with Spring Boot.
- **Maven**: Dependency and build management.

# DOWNLOAD AND INSTALL KAFKA
[https://dlcdn.apache.org/kafka/3.2.0/kafka_2.13-3.2.0.tgz](https://kafka.apache.org/quickstart)

# START THE KAFKA ENVIRONMENT
#  Start the ZooKeeper service
    C:\Users\RAMESH\Downloads\kafka>.\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties

#  Start the Kafka broker service
    C:\Users\RAMESH\Downloads\kafka>.\bin\windows\kafka-server-start.bat .\config\server.properties

# Project structure 

springboot-kafka-project/
 ├── kafka-consumer-wikimedia/
 │    ├── src/
 │    │    └── main/
 │    │         ├── java/com/springboot/kafka/consumer/
 │    │         │    ├── entity/
 │    │         │    │    └── WikimediaData.java
 │    │         │    ├── repository/
 │    │         │    │    ├── WikimediaDataRepository.java
 │    │         │    │    └── KafkaConsumer.java
 │    │         │    └── SpringBootConsumerApplication.java
 │    │         └── resources/
 │    │              └── application.properties
 │    └── pom.xml
 ├── kafka-producer-wikimedia/
 │    ├── src/
 │    │    └── main/
 │    │         ├── java/com/springboot/kafka/producer/
 │    │         │    ├── KafkaTopicConfig.java
 │    │         │    ├── SpringBootProducerApplication.java
 │    │         │    ├── WikimediaChangesHandler.java
 │    │         │    └── WikimediaChangesProducer.java
 │    │         └── resources/
 │    │              └── application.properties
 │    └── pom.xml
 ├── src/
 │    └── main/
 │         └── java/com/springboot/kafka/springbootkafkaproject/
 │              └── SpringbootKafkaProjectApplication.java
 ├── test/
 │    └── java/com/springboot/kafka/springbootkafkaproject/
 │         └── SpringbootKafkaProjectApplicationTests.java
 ├── mvnw
 ├── mvnw.cmd
 ├── pom.xml
 ├── README.md
 └── .gitignore

