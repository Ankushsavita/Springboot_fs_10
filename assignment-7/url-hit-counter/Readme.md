# Visitor Count Application

# Requirements

* Framework - Springboot 3.1.1 version
* Language - Java 17 version
* Build tool - Maven

# Dependencies

* Spring web
* Springboot dev tools

# EndPoint

* http://localhost:8080/api/v1/visitor-count-app/username/ankush/count

# Data Flow

* Controller : This component handles incoming requests and returns responses to the client. It receives requests from the client, invokes the appropriate method on the service layer, and returns the response to the client.


* Service : This component contains the business logic for the application. It receives requests from the controller layer and interacts with the repository layer to perform CRUD (create, read, update, delete) operations on the data.


* DataBase : This is HashMap Database. This is where the user data is stored. The repository layer interacts directly with the database to perform CRUD operations on the data.