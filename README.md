# Java Bootcamp

Collection of Java practice modules covering language fundamentals, collections, file handling, object-oriented programming, and a small Spring Boot CRUD API.

## What This Repo Contains

This repository is best understood as a structured learning repo that shows breadth across core Java topics:

- `basics/` for introductory syntax and control flow
- `List/`, `Set/`, and `map/` for Java collection examples
- `Filesoperations/` for file creation, reading, and writing
- `oop/` for constructors, getters/setters, copy constructors, and basic object design
- `java1/` for a small Spring Boot movie API

## Highlighted Project

### `java1/` Movie CRUD API

The strongest recruiter-facing part of this repo is the Spring Boot application inside `java1/`, which includes:

- controller, service, repository, and model layers
- simple movie CRUD endpoints
- Maven project structure
- basic test scaffold

Example endpoints currently exposed in the controller:

- `GET /getAllMovies`
- `GET /get/{movieID}`
- `POST /createMovie`
- `PUT /updateMovie/{movieId}`
- `DELETE /deleteMovie/{movieId}`

## Why Keep This Repo Public

This repo is useful as evidence of:

- hands-on Java syntax practice
- comfort with collections and file I/O
- early backend API development with Spring Boot

It should be framed as a learning-and-foundation repository, not as a flagship production project.

## Suggested Local Run For `java1/`

```bash
cd java1
./mvnw spring-boot:run
```

On Windows PowerShell:

```powershell
cd java1
.\mvnw.cmd spring-boot:run
```

## Notes

Some generated build artifacts are present in the repo because this project evolved from local practice work. The core value here is the code progression and Java backend basics.
