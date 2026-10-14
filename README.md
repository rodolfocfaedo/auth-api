# Auth API

A Java and Spring Boot API built as a learning project. Authentication and authorization are planned for future development.

## Tech Stack

- Java 21
- Spring Boot
- Spring Web MVC
- Spring Data JPA
- Jakarta Bean Validation
- PostgreSQL
- Lombok
- Gradle Wrapper

## Local Requirements

- JDK 21
- PostgreSQL running locally
- Git

On Windows, use Ubuntu on WSL2 to run the project. A separate Gradle installation is not required.

## Local Configuration

Create a PostgreSQL database named `auth_api` and a database user with access to it.

From the project root, create your local configuration file:

```bash
cp .env.example .env
nano .env
chmod 600 .env
```

Configure the values for your environment:

```dotenv
APP_NAME=auth-api
DB_HOST=localhost
DB_PORT=5432
DB_NAME=auth_api
DB_USER=your_database_user
DB_PASSWORD=your_database_password
SERVER_PORT=8080
```

Keep `.env` out of version control. Commit only `.env.example`, using placeholder credentials.

The application configuration must reference these environment variables. Spring Boot does not load `.env` automatically, so export the variables before starting the application.

## Run

From the project root, give the Gradle Wrapper permission to run:

```bash
chmod +x gradlew
```

Load the local environment variables and start the application:

```bash
set -a
source .env
set +a
./gradlew bootRun
```

The application starts on port `8080` by default.

Press `Ctrl+C` to stop it.

## Compile

```bash
./gradlew clean compileJava
```

## Project Status

The project is in its initial setup phase. Authentication and authorization are not implemented yet.

Planned next steps:

- Implement user registration and validation.
- Integrate Spring Security.
- Add authentication and authorization.
- Add automated tests.