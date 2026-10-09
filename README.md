# Voll Med API

Medical clinic management API developed with Java and Spring Boot. The project focuses on REST API design, validation, package organization, persistence, and database migration practices.

## Overview

This project implements core clinic operations for managing doctors and patients. It demonstrates backend development fundamentals with layered architecture, business rules, validation, and persistence in a relational database.

## Tech Stack

- Java
- Spring Boot
- Spring Data JPA
- Hibernate
- MySQL
- Flyway
- Maven
- Postman

## Features

- Doctor registration
- Doctor listing and search
- Doctor update and inactivation
- Patient registration
- Patient listing and update
- Patient inactivation
- Data validation with Bean Validation
- Pagination and sorting
- MySQL database persistence
- Flyway migrations

## Project Structure

```text
src/
├── main/
│   ├── java/
│   │   └── med/voll/api/
│   │       ├── controller/
│   │       ├── domain/
│   │       ├── dto/
│   │       ├── infra/
│   │       └── service/
│   └── resources/
│       ├── application.properties
│       └── db/migration/
└── test/
```

## Getting Started

### Prerequisites

- Java 21+
- Maven
- MySQL
- Docker (optional)

### Installation

```bash
git clone https://github.com/GabrielVanderlinde/vollmed-api.git
cd vollmed-api
```

### Database configuration

Edit `src/main/resources/application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost/vollmed_api
spring.datasource.username=root
spring.datasource.password=root
```

### Run the application

```bash
mvn clean install
mvn spring-boot:run
```

## API Endpoints

### Doctors

| Method | Endpoint | Description |
|--------|----------|-------------|
| POST | `/medicos` | Register doctor |
| GET | `/medicos` | List doctors |
| PUT | `/medicos` | Update doctor |
| DELETE | `/medicos/{id}` | Inactivate doctor |

### Patients

| Method | Endpoint | Description |
|--------|----------|-------------|
| POST | `/pacientes` | Register patient |
| GET | `/pacientes` | List patients |
| PUT | `/pacientes` | Update patient |
| DELETE | `/pacientes/{id}` | Inactivate patient |

## Validation

The API validates:

- required fields
- e-mail format
- CPF format
- address data
- business rules

## Database Migrations

Flyway is used to handle schema evolution and maintain versioned database changes.

## Notes

This project is a practical study in Spring Boot backend architecture, REST API development, JPA/Hibernate persistence, and migration management.

## License

MIT

## Author

Gabriel Vanderlinde
