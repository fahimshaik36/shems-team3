# Module 1 – Role Based Authentication

## Overview
This repository contains the Authentication and Authorization module of the Smart Home Energy Management System (SHEMS).

The module provides secure user identity management, role-based access control, session handling, and password recovery functionality. It acts as the security foundation for all other modules.

---

## Technology Stack
- Java 17
- Spring Boot
- Spring Security
- Spring MVC
- Spring Data JPA
- Thymeleaf
- MySQL
- Maven

---

## Key Features

### Authentication
- User registration and login
- BCrypt password encryption
- Secure session management
- Logout handling

### Authorization
- Role-based access control (USER / ADMIN)
- Protected routes using Spring Security
- Custom authentication success handler

### Password Recovery
- Forgot password workflow
- Secure password reset using tokens
- Email service integration

---

## Project Structure

```
Module_1_RoleBasedAuthentication
│
├── .mvn/
├── src/
│   ├── main/
│   │   ├── java/com/role/implementation/
│   │   │   ├── config/
│   │   │   │   ├── SpringSecurityConfig.java
│   │   │   │   ├── CustomSuccessHandler.java
│   │   │   │   └── GlobalModelAttributes.java
│   │   │   │
│   │   │   ├── controller/
│   │   │   │   ├── LoginController.java
│   │   │   │   ├── RegistrationController.java
│   │   │   │   ├── ForgotPasswordController.java
│   │   │   │   └── HomeController.java
│   │   │   │
│   │   │   ├── model/
│   │   │   │   ├── User.java
│   │   │   │   ├── Role.java
│   │   │   │   └── PasswordResetToken.java
│   │   │   │
│   │   │   ├── repository/
│   │   │   │   ├── UserRepository.java
│   │   │   │   ├── RoleRepository.java
│   │   │   │   └── PasswordResetTokenRepository.java
│   │   │   │
│   │   │   ├── service/
│   │   │   │   ├── DefaultUserService.java
│   │   │   │   ├── DefaultUserServiceImpl.java
│   │   │   │   └── MailService.java
│   │   │   │
│   │   │   └── RoleBasedAuthenticationApplication.java
│   │   │
│   │   └── resources/
│   │       ├── templates/
│   │       └── application.properties
│   │
├── pom.xml
└── README.md
```

---

## Running the Module

Create database:
```
CREATE DATABASE shems_auth;
```

Run:
```
mvn spring-boot:run
```

Open:
```
http://localhost:8080/login
```

---

## Role in SHEMS
Provides secure authentication and role-based authorization for further modules too.
