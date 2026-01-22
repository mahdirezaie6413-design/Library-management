## Library Management System

## Java JDBC & PostgreSQL Project

## Project Description

This project is a Java-based console application developed to demonstrate the practical use of JDBC (Java Database Connectivity) for interacting with a PostgreSQL database.
The application performs basic database operations such as inserting and retrieving data while following standard JDBC practices.

Objectives

To establish a secure connection between Java and PostgreSQL

To use PreparedStatement for executing SQL queries

To demonstrate basic INSERT and SELECT (JOIN) operations

To display database records in a clear and structured console output

## Technologies Used

Java

PostgreSQL

pgAdmin

JDBC

IntelliJ IDEA

Database Structure

## Database Name: library_management

Tables:

authors (stores author information)

books (stores book information with a foreign key reference to authors)

## Application Workflow

The application connects to the PostgreSQL database using JDBC.

A book record is inserted into the books table using a PreparedStatement.

Book data is retrieved using a SELECT query with a JOIN between books and authors.

The retrieved data is displayed in the console in a readable format.

## Conclusion

This project provides a clear and practical example of how Java applications can interact with relational databases using JDBC.
It follows clean code principles and demonstrates essential database operations required for academic and beginner-level projects.
