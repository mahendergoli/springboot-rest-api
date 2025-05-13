# springboot-rest-api
Created a REST-API and performed it rules

A simple RESTful API built using Spring Boot that performs **CRUD operations** on user data such as `userId`, `name`, `qualification`, and `email`.

---

## 🚀 Features

- **GET /user** – Retrieve all users.
- **POST /user** – Add a new user.
- **PUT /user/{userId}** – Update a user by ID.
- **DELETE /user/{userId}** – Delete a user by ID.

This project uses an **in-memory HashMap** for storing users (no database connected).

---

## 🛠 Technologies Used

- **Java 17+**
- **Spring Boot**
- **Maven** (or Gradle)
- **Spring Web**
- JSON (for data transfer)
- Postman (for testing)

---

## 💻 How to Run the Project

### Prerequisites:
- Java (JDK 17 or higher)
- Maven installed (or use IDE like IntelliJ/Eclipse)

### Steps:
1. Clone the repository:
   ```bash
   git clone https://github.com/mahendergoli/springboot-rest-api.git
   cd springboot-rest-api
