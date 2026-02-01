## Library Management System

## Homework 4 – Java JDBC & PostgreSQL Project

---

##  Project Description

This project was developed as part of Homework 4 to demonstrate how Java applications can interact with relational databases using **JDBC (Java Database Connectivity)**.  
It is a console‑based application that connects to a **PostgreSQL** database, performs basic operations such as inserting and retrieving records, and follows clean coding and layered architecture principles.

---

## Objectives

- Establish a secure connection between Java and PostgreSQL  
- Use `PreparedStatement` for executing SQL queries safely  
- Demonstrate basic `INSERT` and `SELECT (JOIN)` operations  
- Display database records in a clear, structured console output  
- Provide a practical academic example of JDBC usage  

---

##  Technologies Used

- Java  
- PostgreSQL  
- pgAdmin  
- JDBC  
- IntelliJ IDEA  

---

##  Database Structure

**Database Name:** `library_management`

**Tables:**
- `authors` → stores author information  
- `books` → stores book information with a foreign key reference to `authors`  

---

##  Project Structure

src/
└── main/
└── java/
├── model/               # Data classes such as Book and Author
├── repository/          # Database access layer (JDBC queries)
├── service/             # Business logic and validation
├── controller/          # Handles user interaction with services
└── main/                # Entry point (Main.java)


##  Application Workflow

1. The application connects to the PostgreSQL database using JDBC.  
2. A new book record is inserted into the `books` table via `PreparedStatement`.  
3. Book data is retrieved using a `SELECT` query with a `JOIN` between `books` and `authors`.  
4. The retrieved records are displayed in the console in a readable format.  

---

##  Sample Output

## Book List:
ID: 1 | Title: Clean Code | Author: Robert C. Martin
ID: 2 | Title: Effective Java | Author: Joshua Bloch





##  Conclusion

This project provides a clear and practical example of how Java applications can interact with relational databases using JDBC.  
It demonstrates essential database operations required for academic projects, adheres
