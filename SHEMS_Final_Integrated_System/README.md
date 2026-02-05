# SHEMS Final Integrated System

## Overview
This repository contains the fully integrated Smart Home Energy Management System built using Spring Boot.

All modules (Authentication, Device Management, Energy Tracking, Analytics, Scheduling, and Admin Policy Enforcement) are combined into a single working web application.

---

## Application Features

### Authentication and Authorization
- User registration and login
- Role-based access (USER / ADMIN)
- Password encryption and session management
- Forgot and reset password functionality

### Smart Device Management
- Add and remove devices
- Turn devices ON/OFF
- Admin control over all devices

### Real-Time Energy Tracking
- Tracks device usage duration
- Calculates energy consumption
- Maintains historical energy data

### Analytics Dashboard
User analytics:
- Weekly and monthly energy trends
- Device usage comparison
- Energy saving recommendations

Admin analytics:
- System-wide energy monitoring
- Top energy consuming devices
- High usage users detection

### Scheduling and Automation
- Create device schedules
- Automatic ON/OFF execution
- Background scheduler processing

### Admin Energy Policy Enforcement
- Create energy policies
- Set time windows and thresholds
- Automatically turn OFF high consumption devices
- Policy enforcement logs

---

## Technology Stack

Backend  
- Java 17  
- Spring Boot  
- Spring MVC  
- Spring Security  
- Spring Data JPA  

Frontend  
- Thymeleaf  
- HTML / CSS  

Database  
- MySQL  

Build Tool  
- Maven  

Schedulers  
- Spring @Scheduled  

---

## Project Structure

```
SHEMS_Final_Integrated_System
│
├── src/main/java/com/role/implementation/
│   ├── config/
│   ├── controller/
│   ├── model/
│   ├── repository/
│   ├── service/
│   ├── devicemanagement/
│   ├── energytracking/
│   ├── analytics/
│   ├── automation/
│   └── adminpolicy/
│
├── src/main/resources/
│   ├── templates/
│   └── application.properties
│
├── pom.xml
└── mvnw
```

---

## How to Run

### 1. Create Database
```
CREATE DATABASE shems;
```

### 2. Configure Database
Open:
```
src/main/resources/application.properties
```

Update:
```
spring.datasource.url=jdbc:mysql://localhost:3306/shems
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
```

### 3. Run Application
```
mvn spring-boot:run
```

### 4. Open Browser
```
http://localhost:8080
```

---

## Default Roles

USER  
- Manage personal devices  
- View analytics  
- Create schedules  

ADMIN  
- Monitor all users and devices  
- View system analytics  
- Create energy policies  

---

## Summary
This repository represents the final integrated version of the Smart Home Energy Management System demonstrating a complete modular Spring Boot application.
