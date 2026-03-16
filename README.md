# User Management API

REST API for managing users built with **Java** and **Spring Boot**.

#Features
- Create users
- Retrieve users
- Update users
- Delete users
- Input validation
- Global exception handling

#Technologies
- Java 17
- Spring Boot
- Spring Data JPA
- Hibernate
- H2 Database
- Maven
- Swagger / OpenAPI

#API Endpoints

| Method | Endpoint | Description |
|------|------|------|
| GET | /users | Get all users |
| GET | /users/{id} | Get user by ID |
| POST | /users | Create a new user |
| PUT | /users/{id} | Update user |
| DELETE | /users/{id} | Delete user |

#Running the project
mvn spring-boot:run

Swagger documentation:
http://localhost:8080/swagger-ui/index.html

Clone the repository:

```bash
git clone https://github.com/elias2999/user-management-api.git

