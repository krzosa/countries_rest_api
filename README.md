# Countries Rest API in Spring
This is a REST API based on https://restcountries.eu/ 
 made to broaden my knowledge
about Spring/databases/REST. 

## Technologies
* [Spring-Boot](https://spring.io/projects/spring-boot)
* [Spring MVC](https://docs.spring.io/spring/docs/current/spring-framework-reference/web.html)
* [Spring data JPA](https://spring.io/projects/spring-data-jpa)
* [H2 Database](https://en.wikipedia.org/wiki/H2_(DBMS)
* [GSON(json to pojo conversion)](https://github.com/google/gson)
* [Project Lombok](https://projectlombok.org/)

## How to run(cmd):
1. git clone (repository)
1. cd (repository folder)
1. mvn clean install
1. mvnw spring-boot:run

## How to use
The application, after you run it, 
will enable certain REST API endpoints to which you
will be able to make HTTP requests to from your front end application
or your favourite browser(Mozilla, Chrome etc.).
Those endpoints will in return serve you information in JSON format.
You can ask for specific countries or you can ask for everything etc.
Here is the list of all the request commands:
### Rest API Endpoints
* ALL  
    * localhost:8080/rest/all
* Name or code
    * localhost:8080/rest/codeOrNameHereee
    * localhost:8080/rest/PL
    * localhost:8080/rest/poland
    * localhost:8080/rest/POL
* Name
    * localhost:8080/rest/name/nameHereee
    * localhost:8080/rest/name/Poland
    * localhost:8080/rest/name/estonia
* Code
    * localhost:8080/rest/code/codeHereee
    * localhost:8080/rest/code/PL
    * localhost:8080/rest/code/USA
* More soon

## JSON Response example





