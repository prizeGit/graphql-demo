# Demo GraphQL 
A Spring, Docker-Compose and GraphQl microservice

## Git
- https://github.com/redintro/demo-graphql
- git@github.com:redintro/demo-graphql.git

## Building with Maven
The project is configured to use maven as its build tool:
- To build: `mvn clean install`

## Running the application
Start the database using docker-compose and then start the service

## Running the database
The database can be started and stopped from the command line:
- Start: `docker-compose up -d --build`
- Stop: `docker-compose down -v`

## Running the service
The service can be started either by using an IDE or via the command line:
- To run: java -jar target/graphql-demo-0.0.1-SNAPSHOT.jar

## GraphQL API documentation
To view the GraphQL API documentation and interact with the application:
- View: http://localhost:8081/graphiql

## Test coverage checks and reporting
Jacoco code coverage checks and reports are automatically performed and generated as part of the build:
- Run: `mvn clean install`
- Coverage reports are available at target/site/jacoco/index.html

## Database initialisation and maintenance 
Uses liquibase to manage the database schema and data 
- Schema definition: `src/main/resources/db/changelog`
- Initialisation: `src/main/resources/db/data`
