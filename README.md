# 📝 Notes API

A REST API built with Spring Boot that allows users to create, retrieve, update, and delete notes.

This project was built to learn the fundamentals of backend development and Spring Boot, with the long-term goal of building production-ready backend services and eventually Spring Boot microservices.

---

# 🎯 Why I Built This

This project was created to learn:

- Spring Boot fundamentals
- REST API design
- Layered architecture
- Dependency Injection
- HTTP requests and responses
- CRUD operations
- Exception handling
- Testing APIs with Postman

It follows a common backend structure:

```
Controller
↓
Service
↓
Repository
↓
Model
```

This architecture is commonly used in Spring Boot applications and microservices.

---

# 🛠 Technologies Used

- Java
- Spring Boot
- Maven
- Lombok
- Postman

---

# 📂 Project Structure

```text
src/main/java
│
├── controller
│   └── NoteController
│
├── service
│   ├── NoteService
│   └── NoteServiceImpl
│
├── repository
│   └── NoteRepository
│
├── model
│   └── Note
│
├── exception
│   ├── NoteNotFoundException
│   └── GlobalExceptionHandler
│
└── NotesApiApplication
```

---

# 📌 Features

## Create a note

```http
POST /api/v1/notes
```

Example request:

```json
{
  "title": "Shopping List",
  "content": "Milk, Bread, Eggs"
}
```

---

## Get all notes

```http
GET /api/v1/notes
```

---

## Get a note by ID

```http
GET /api/v1/notes/{id}
```

---

## Update a note

```http
PUT /api/v1/notes/{id}
```

Example request:

```json
{
  "title": "Updated Shopping List",
  "content": "Milk, Bread, Eggs, Butter"
}
```

---

## Delete a note

```http
DELETE /api/v1/notes/{id}
```

---

# ⚠ Error Handling

The API includes:

- Custom exception handling
- Global exception handling using `@ControllerAdvice`
- Proper HTTP 404 responses when a note cannot be found

Example:

```http
GET /api/v1/notes/{invalid-id}
```

Response:

```http
404 NOT FOUND
```

```text
Note not found with id: ...
```

---

# 🧠 What I Learned

- Spring Boot project setup
- REST controllers
- Dependency Injection
- Service and repository layers
- UUID handling
- HTTP status codes
- ResponseEntity
- Global exception handling
- Postman API testing

---

# 🚀 Possible Future Improvements

This project intentionally stores notes in memory.

Potential future enhancements:

- PostgreSQL database
- Spring Data JPA
- DTOs
- Validation (`@Valid`, `@NotBlank`)
- Unit testing with JUnit and Mockito
- Created/Updated timestamps
- Structured API error responses
- Docker containerisation
- Authentication and authorization
