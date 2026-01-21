# Smart Home Energy Management System (SHEMS)
## Module 1: Authentication and Role-Based Access Control (RBAC)

This repository contains Module 1 of the Smart Home Energy Management System (SHEMS). The module implements secure user authentication and role-based authorization using Spring Boot, Spring Security, Thymeleaf, and MySQL. It ensures that only authenticated users can access the system and that features/pages are accessible based on assigned roles (USER, ADMIN).

## Overview
Module 1 provides:
- User Registration (Signup)
- User Login (Signin)
- Encrypted password storage using BCrypt
- Role-Based Access Control (RBAC)
- Role-based redirection after successful login:
  - USER -> /dashboard
  - ADMIN -> /adminScreen

This module serves as the foundation for upcoming SHEMS modules such as device management, energy monitoring, scheduling, reporting, and alerts.

## Features
Authentication:
- Registration through a web form
- Login using Spring Security authentication flow
- Server-side credential validation

Password Security:
- Passwords stored only in encrypted form (BCrypt)
- No plain-text password storage in the database

Authorization (RBAC):
- Supported roles: USER, ADMIN
- Role details stored in the role table
- User-role mapping stored in the users_role table

Role-Based Redirection:
- After successful login, users are redirected based on their role:
  - USER -> User Dashboard (/dashboard)
  - ADMIN -> Admin Dashboard (/adminScreen)

## Tech Stack
- Java
- Spring Boot 2.7.0
- Spring Security
- Spring MVC + Thymeleaf
- Hibernate / JPA
- MySQL
- Maven
- Embedded Tomcat Server

## Project Structure
- config/ : Spring Security configuration and login success handler
- controller/ : Controllers for login, registration, admin and user screens
- DTO/ : Request/response data transfer objects
- model/ : JPA entities (User, Role)
- repository/ : Database access layer
- service/ : Business logic implementation
- templates/ : Thymeleaf UI pages (login, register, dashboards, etc.)

## Setup Instructions
1) Prerequisites
Install:
- Java JDK (recommended: 17)
- Eclipse IDE (or IntelliJ)
- MySQL Server
- MySQL Workbench
Note: The application uses embedded Tomcat, so no external Tomcat installation is required.

2) Create Database
Open MySQL Workbench and run:
CREATE DATABASE role_auth;

3) Configure application.properties
Update:
src/main/resources/application.properties
Use:
spring.datasource.url=jdbc:mysql://localhost:3306/role_auth
spring.datasource.username=root
spring.datasource.password=YOUR_PASSWORD
spring.jpa.show-sql=true
spring.jpa.hibernate.ddl-auto=update
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

4) Run the Application
Run:
RoleBasedAuthenticationApplication.java
Expected console output:
Tomcat started on port(s): 8080 (http)
Started RoleBasedAuthenticationApplication

## Application URLs
- Login Page: http://localhost:8080/login
- Register Page: http://localhost:8080/register
- User Dashboard: http://localhost:8080/dashboard
- Admin Screen: http://localhost:8080/adminScreen

## Demo Accounts (Testing)
- USER: user@gmail.com / 1234
- ADMIN: admin@gmail.com / 1234

## Database Tables
- user : Stores user details (id, name, email, encrypted password)
- role : Stores role definitions (USER, ADMIN)
- users_role : Maps users to roles (cust_id <-> role_id)

## Working Flow
1. User registers via /register
2. User data is stored in MySQL
3. Password is encrypted using BCrypt
4. User logs in via /login
5. Spring Security authenticates the user
6. Role is fetched from the database
7. Role-based redirect occurs:
   - USER -> /dashboard
   - ADMIN -> /adminScreen

## Status
Module 1 completed:
- Registration implemented
- Login implemented
- Role-based authorization implemented
- Role-based redirection implemented
- MySQL integration completed
