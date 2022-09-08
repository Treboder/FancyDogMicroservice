# Getting Started
Simple example demonstrating automatically created REST endpoints via spring-boot-starter-data-rest.
Implementation creates a REST service for a simple data class <Dog> without the need to write separate controller or any other service.
We also register the service to a running Eureka instance, so make sure that Eureka is already running (http://localhost:8761/).

Navigate to http://localhost:8762/dogs to see the exposed dog microservice.  

## Operations

### GET (in order to retrieve list of prices)
```
http://localhost:8762/dogs
```
### GET (in order to retrieve a certain price by id)
```
http://localhost:8762/dogs/1
``` 
### POST (in order to save a new price)
```
http://localhost:8762/dogs/
``` 
with following JSON payload:
```      
    {
        "name" : "Rex",
        "breed" : "Schäferhund",
        "origin" : "Deutschland"
    }
```

### DELETE (a certain price by id)
```
http://localhost:8762/dogs/1
```

### PUT (in order to update a certain price by id)
```
http://localhost:8762/dogs/1
```

### ToDo: Find solution for Eureka showing host.docker.internal instead of ip 
- [spring-boot-cloud-eurka-windows-10-eurkea-returns-host-docker-internal-for-client](https://stackoverflow.com/questions/57319678/spring-boot-cloud-eurka-windows-10-eurkea-returns-host-docker-internal-for-clien)

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.7.3/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.7.3/maven-plugin/reference/html/#build-image)
* [Spring Data JPA](https://docs.spring.io/spring-boot/docs/2.7.3/reference/htmlsingle/#data.sql.jpa-and-spring-data)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.7.3/reference/htmlsingle/#web)
* [Rest Repositories](https://docs.spring.io/spring-boot/docs/2.7.3/reference/htmlsingle/#howto.data-access.exposing-spring-data-repositories-as-rest)
* [Config Client Quick Start](https://docs.spring.io/spring-cloud-config/docs/current/reference/html/#_client_side_usage)
* [Eureka Discovery Client](https://docs.spring.io/spring-cloud-netflix/docs/current/reference/html/#service-discovery-eureka-clients)

### Guides
The following guides illustrate how to use some features concretely:

* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)
* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)
* [Accessing JPA Data with REST](https://spring.io/guides/gs/accessing-data-rest/)
* [Accessing Neo4j Data with REST](https://spring.io/guides/gs/accessing-neo4j-data-rest/)
* [Accessing MongoDB Data with REST](https://spring.io/guides/gs/accessing-mongodb-data-rest/)
* [Service Registration and Discovery with Eureka and Spring Cloud](https://spring.io/guides/gs/service-registration-and-discovery/)


Also compare [spring-boot-crudrepository-with-example](https://www.geeksforgeeks.org/spring-boot-crudrepository-with-example/)
