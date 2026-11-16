# Movie Management System

A Java Spring Boot REST API project to manage movie records.

## About the Project

Movie Management System is a backend application developed using Java and Spring Boot. It provides REST APIs to retrieve, search, and add movie information.

The project currently uses an in-memory HashMap as a temporary data store.

## Tech Stack

- Java
- Spring Boot
- Spring Web
- Maven
- REST API
- HashMap
- Postman

## Features

- Get all movies
- Get a movie by ID
- Search movies by name
- Add a new movie
- JSON-based API communication

## Project Architecture

Controller → Service → Repository → HashMap

- **Entity:** Represents movie data.
- **Controller:** Handles HTTP requests.
- **Service:** Handles application logic.
- **Repository:** Performs data operations.

## API Endpoints

| Method | Endpoint | Description |
|---|---|---|
| GET | `/movie` | Get all movies |
| GET | `/movie/{id}` | Get movie by ID |
| GET | `/movie/search?name=KGF` | Search movie by name |
| POST | `/movie` | Add a new movie |

## Sample JSON

Use this JSON body when adding a movie through POST `/movie`:

```json
{
  "id": 5,
  "name": "Interstellar",
  "genre": "Sci-Fi",
  "rating": 9.0,
  "year": 2014,
  "language": "English"
}
```

## How to Run

1. Clone the repository.
2. Open the project in IntelliJ IDEA.
3. Load the Maven dependencies.
4. Run `MovieProjectApplication.java`.
5. Test the APIs using Postman.

Default local URL:

`http://localhost:8080`

## Data Storage

This version uses Java HashMap for temporary in-memory storage. Movie data added through the API is not permanently stored and will be reset when the application restarts.

## GitHub Repository

https://github.com/GauravTeck/-Movie-Management-System.git