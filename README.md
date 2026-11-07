# Auth API

A backend project built with Java and Spring Boot to explore authentication, security, and database management.

> **Status:** Under development. Authentication and authorization are not fully implemented yet.

## Technologies

- Java 21
- Spring Boot
- Spring Security
- Spring Data JPA
- PostgreSQL
- Flyway
- Gradle
- Lombok

## Current features

- `User` entity mapped to the database
- Versioned database migration with Flyway
- Database schema validation with Hibernate
- Test endpoint at `GET /test`
- Local startup script

## Prerequisites

- Java 21
- PostgreSQL
- Git

The project includes the Gradle Wrapper, so a separate Gradle installation is not required.

## Getting started

### 1. Clone the repository

```bash
git clone https://github.com/rodolcfaedo/auth-api.git
cd auth-api
```

### 2. Set up the database

Create a PostgreSQL database and make sure your database user has the necessary permissions.

### 3. Configure environment variables

Create your local environment file from the example:

```bash
cp .env.example .env
```

Update `.env` with your database connection details and the other settings described in `.env.example`.

> Keep your `.env` file private. Do not commit credentials to the repository.

### 4. Run the application

```bash
./scripts/run-local.sh
```

The script loads the environment variables from `.env` and starts the application using the Gradle Wrapper.

Flyway applies pending migrations when the application starts. Hibernate then validates the database schema against the mapped entities.

## Test endpoint

```http
GET /test
```

The endpoint returns:

```text
Testing Security
```

Spring Security is enabled, so the endpoint may require authentication using the current default configuration.

## Database migrations

Migration files are located in:

```text
src/main/resources/db/migration/
```

The first migration creates the `users` table:

```text
V1__create_table_users.sql
```

Once a migration has been applied to a shared database, create a new versioned migration for subsequent changes instead of editing the existing file.

## Project status

This project is being developed as a learning exercise. The authentication and authorization flows are planned and have not yet been completed.
