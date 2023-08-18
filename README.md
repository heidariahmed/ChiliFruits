# Chilifruits
This is the backend for the ForsakringGirot application, which manages chili fruits and their quantities.

## Introduction
Chilifruits is a Spring Boot application that provides RESTful API endpoints for managing chili fruits and their quantities. 
The application uses Spring Data JPA for data access and MySQL as the database.

## Technologies
Java 8
Spring Boot 2.5.4
Spring Data JPA
MySQL 8.0.33
Gradle

## Setup
### Have this in ur application.properties
Set up your MySQL database and configure the database connection in src/main/resources/application.properties

spring.datasource.url=jdbc:mysql://localhost:3307/chilifruits?useSSL=true&serverTimezone=UTC&allowPublicKeyRetrieval=true

spring.datasource.username=root

spring.datasource.password=example

spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect

spring.jpa.hibernate.ddl-auto=update

logging.level.org.hibernate.SQL=debug

logging.level.org.hibernate.type.descriptor.sql.BasicBinder=trace

## API Endpoints
GET /api/chilifruits: Get a list of all chili fruits.
POST /api/chilifruits/{id}/updateQuantity: Update the quantity of a specific chili fruit.

## Database Configuration
The database configuration is defined in src/main/java/com/example/forsakringGirot/dataAccess/DatabaseConfig.java. 
Make sure to set the appropriate values for your database connection.

## Running the Application
Run ./gradlew run
The application will start on http://localhost:8080. Feel free to change which port the tomcat should start on in application.properties

## Unit Tests
The application contains unit tests for various components. To run the tests, use the following command:
./gradlew test

## Api Docummentation
