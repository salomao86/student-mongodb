# Welcome to SalomaoTech

SalomaoTech is a company that develops products for all its customers' needs. Present in several parts of the world including Brazil.

# Introducing StudentMongodb

Student Mongodb is a project that allows you to control student data through CRUD services with rest API

## Requirements

The project requires [Java 11](https://www.oracle.com/br/java/technologies/javase/jdk11-archive-downloads.html) or
higher.

The project makes use of Apache Maven 3.6.3 (https://maven.apache.org/docs/3.6.3/release-notes.html) 

We use a non-relational database MongoDB (https://www.mongodb.com)

You just need to install Java 11 and Maven 3.6.3.

### Build the project

```console
$ ./mvn clean install
```

### Run the project

The application will start on port `8080`.
```console
$ ./mvn spring-boot:run
```

### Run the tests
```console
$ ./mvn test
```

## API

Below is a list of the main API endpoints.

### Create a new student

Endpoint

```text
POST /api/students
```

Example of body

```json
{
    "name": "John Carter",
    "email": "john.carter@mail.com"
}
```

Response
HTTP Status 200

### Get all students

Endpoint

```text
GET /api/students
```

Example of body

```json
{
    "id": "fd282131-d8aa-4819-b0c8-d9e0bfb1b75c",
    "name": "John Carter",
    "email": "john.carter@mail.com"
}
```

Response
HTTP Status 201

### Suggestions for improvement
- Use the application and database in docker
- Implement data auditing with envers (https://docs.jboss.org/envers/docs/)
- Implement checkstyle and integration with sonar.

