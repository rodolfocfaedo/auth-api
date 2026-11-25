# Auth API

A Java and Spring Boot backend project for learning authentication, security, and database management.

> **Status:** Under development. Login, registration, token generation, and authorization flows are not implemented yet.

## Technologies

- Java 21
- Spring Boot and Spring Web MVC
- Spring Security
- Spring Data JPA and Hibernate
- Jakarta Bean Validation
- PostgreSQL and Flyway
- Gradle Wrapper
- Lombok

## Current implementation

- `User` entity mapped to the `users` table and implementing `UserDetails`
- `UserRepository` with a lookup by email
- Request and response DTOs for login and user registration, with validation annotations on request fields
- Versioned database migration with Flyway and schema validation with Hibernate
- Test endpoint at `GET /`
- Shell script for local startup

The DTOs and repository provide building blocks; they do not yet expose registration or login endpoints. The user entity currently returns an empty list of authorities.

## Prerequisites

- Java 21
- PostgreSQL
- Git
- Bash for the local startup script

The project includes the Gradle Wrapper; a separate Gradle installation is not required.

## Getting started

### 1. Clone the repository

```bash
git clone https://github.com/rodolfocfaedo/auth-api.git
cd auth-api
```

### 2. Prepare the database

Create a PostgreSQL database and ensure its user has the permissions needed to connect and apply migrations.

### 3. Configure environment variables

> **Warning:** Run the following command only when `.env` does not already exist.
> It overwrites an existing `.env`, replacing your local database credentials
> with example values. If you already have an `.env`, edit it directly instead.

```bash
cp .env.example .env
```

Edit `.env` with your local settings:

```dotenv
APP_NAME=auth-api
DB_HOST=localhost
DB_PORT=5432
DB_NAME=auth_api
DB_USER=your_db_user
DB_PASSWORD=your_db_password
SERVER_PORT=8080
```

Use the database name and credentials configured in your PostgreSQL instance. Keep `.env` private and do not commit credentials.

### 4. Start the application

From the project directory, run:

```bash
./scripts/run-local.sh
```

The script changes to the project root, loads `.env`, and runs `./gradlew bootRun`. Flyway applies pending migrations on startup, and Hibernate validates the schema against the entities. The default server port is `8080`.

## Test endpoint

```http
GET /
```

When the request is authenticated under the current Spring Security configuration, the endpoint returns:

```text
Testing Security
```

Spring Security is enabled. Authentication and authorization are still under development; the project does not yet provide a custom login flow.

## Database migrations

Flyway migrations are stored in `src/main/resources/db/migration/`. The initial migration, `V1__create_table_users.sql`, creates the `users` table.

After a migration has been applied, add a new versioned migration for subsequent schema changes rather than editing the existing one. Hibernate is configured with `ddl-auto: validate`, so schema changes must be reflected in the migrations.

## Project status

This is a learning project in active development. The request and response models and persistence layer are early steps toward authentication; registration, login, token handling, and authorization remain to be implemented.
