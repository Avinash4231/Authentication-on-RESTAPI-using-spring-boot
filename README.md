# Authentication on Student CRUD REST API using Spring Boot

### Overview
This project demonstrates how to implement authentication for a Student CRUD (Create, Read, Update, Delete) REST API using Spring Boot. The application ensures that only authorized users can access and manipulate student records.

### Features
CRUD Operations: Create, Read, Update, and Delete student records.
Authentication: Secure API endpoints using Spring Security.
Database Integration: Use H2 in-memory database for development and testing.

### Technologies Used
Spring Boot
Spring Security
Spring Data JPA
H2 Database
Java
Maven

### Prerequisites
Java 8 or higher
Maven 3.6.0 or higher
Docker (optional, for containerization)
Setup Instructions
##### Clone the Repository
```
git clone https://github.com/yourusername/studentcrud-auth-api.git
cd studentcrud-auth-api
```

##### Build the Project
```
mvn clean install
```
##### Run the Application
```
mvn spring-boot:run
```
##### Access the API
The API will be accessible at http://localhost:8080/api/students.

Authentication
This application uses Spring Security to protect the API endpoints. You need to provide valid credentials to access the endpoints.

Default Credentials
Username: user
Password: password
Example Requests
##### Create a Student
```
curl -X POST -u user:password -H "Content-Type: application/json" -d '{"name": "John Doe", "email":"xyz@gmail.com", "course":"B.tech", "branch":"CSE"}' 
http://localhost:8080/api/students
```

##### Get All Students
```
curl -X GET -u user:password http://localhost:8080/api/students
```

##### Get a Student by ID
```
curl -X GET -u user:password http://localhost:8080/api/students/{id}
```
##### Update a Student
```
curl -X PUT -u user:password -H "Content-Type: application/json" -d '{"name": "Jane Doe", "email":"Jane@gmail.com", "course":"B.tech", "branch":"CIVIL"}'
http://localhost:8080/api/students/{id}
```
##### Delete a Student
```
curl -X DELETE -u user:password http://localhost:8080/api/students/{id}
```
