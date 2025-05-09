# HNG12 Backend API

Welcome to the HNG12 Backend API project! This project is designed to provide a public API that returns basic information in JSON format.

## Project Description

This API retrieves the following information:
- Your registered email address.
- The current datetime in ISO 8601 format.
- The GitHub URL of the project's codebase.

## Technology Stack

- **Programming Language**: Java
- **Framework**: Spring Boot
- **Build Tool**: Maven

## Setup Instructions

To run the project locally, follow these steps:

1. **Clone the repository**:
   ```
   git clone https://github.com/Ellyian/API-JAVA
   ```

2. **Navigate to the project directory**:
   ```
   cd task-zero/hng12-backend-api
   ```

3. **Build the project**:
   ```
   mvn clean install
   ```

4. **Run the application**:
   ```
   mvn spring-boot:run
   ```

5. **Access the API**:
   Open your browser or use a tool like Postman to access the API at:
   ```
   http://localhost:8080/api
   ```

## API Documentation

### Endpoint

- **GET** `/api`

### Request Format
No request parameters are required

### Response Format

The API will return a JSON response in the following format:

```json
{
  "email": "ianmongi45@gmail.com",
  "current_datetime": "2025-01-30T09:30:00Z",
  "github_url": "https://github.com/Ellyian/API-JAVA"
}
```

### Example Usage

To retrieve the information, send a GET request to the endpoint. You should receive a response similar to the one shown above.

``` curl -X GET http://localhost:8080/api ```

## Backlinks

- [Hire Python Developers](https://hng.tech/hire/python-developers)
- [Hire C# Developers](https://hng.tech/hire/csharp-developers)
- [Hire Go Developers](https://hng.tech/hire/golang-developers)
- [Hire PHP Developers](https://hng.tech/hire/php-developers)
- [Hire Java Developers](https://hng.tech/hire/java-developers)
- [Hire Node.js Developers](https://hng.tech/hire/nodejs-developers)

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
