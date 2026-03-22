# Greeting App – Spring Boot REST API

## Project Description

Greeting App is a Spring Boot REST API project developed using IntelliJ IDEA, Spring Initializer, MySQL, and JPA.
This project demonstrates layered architecture using Controller, Service, Repository, and Model, and implements full CRUD operations step by step using Use Cases (UC1 – UC8).

Project package:
com.SpringBoot.GreetingApp

Technologies used:

* Java 17
* Spring Boot
* Spring Web
* Spring Data JPA
* MySQL
* Maven
* IntelliJ IDEA
* curl (for testing)

---

## Project Architecture

Client
↓
Controller
↓
Service
↓
Repository
↓
Database (MySQL)

---

## Dependencies used (pom.xml)

* spring-boot-starter-web
* spring-boot-starter-data-jpa
* mysql-connector-j
* lombok (optional)

---

## Database Configuration

application.properties

spring.datasource.url=jdbc:mysql://localhost:3306/greetingdb
spring.datasource.username=root
spring.datasource.password=1234

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect

Create database in MySQL:

create database greetingdb;

---

## Packages Used

com.SpringBoot.GreetingApp.controller
com.SpringBoot.GreetingApp.service
com.SpringBoot.GreetingApp.repository
com.SpringBoot.GreetingApp.model

---

## UC1 – GreetingController with JSON response

Created REST controller with GET, POST, PUT, DELETE methods.

Test using curl:

curl http://localhost:8080/greeting

Concepts used:

* @RestController
* @GetMapping
* @PostMapping
* @PutMapping
* @DeleteMapping

---

## UC2 – Service Layer Added

GreetingController now calls GreetingService.

Concepts used:

* @Service
* @Autowired
* Layered architecture

Controller → Service → Response

---

## UC3 – Greeting with First Name / Last Name

API can return:

Hello World
Hello FirstName
Hello LastName
Hello FirstName LastName

Example:

/greeting?firstName=Prajwal
/greeting?lastName=Thorat
/greeting?firstName=Prajwal&lastName=Thorat

Concepts used:

* @RequestParam
* Optional parameters
* Logic handling

---

## UC4 – Save Greeting to Repository

Added database support using JPA + MySQL.

Created:

Model → Greeting
Repository → GreetingRepository
Service → saveGreeting
Controller → POST /save

API:

POST /greeting/save?message=HelloDB

Concepts used:

* @Entity
* @Id
* @GeneratedValue
* JpaRepository
* save()

---

## UC5 – Find Greeting by ID

API:

GET /greeting/{id}

Example:

/greeting/1

Concepts used:

* findById()
* Optional
* @PathVariable

---

## UC6 – List All Greetings

API:

GET /greeting/all

Concepts used:

* findAll()
* List<Greeting>

---

## UC7 – Update Greeting

API:

PUT /greeting/update/{id}?message=NewMessage

Concepts used:

* findById()
* save()
* update record

---

## UC8 – Delete Greeting

API:

DELETE /greeting/delete/{id}

Concepts used:

* deleteById()
* CRUD complete

---

## CRUD Operations Summary

* Create → POST /save
* Read → GET /{id}
* Read All → GET /all
* Update → PUT /update/{id}
* Delete → DELETE /delete/{id}

---

## How to Run

1. Create database greetingdb
2. Update application.properties
3. Run GreetingAppApplication
4. Test using curl or Postman

---
