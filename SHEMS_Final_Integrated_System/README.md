# Smart Home Energy Management System – Final Integrated Application

## Overview
This repository contains the fully integrated implementation of the Smart Home Energy Management System (SHEMS) built using Spring Boot.

The application provides a complete platform to monitor, control, automate and optimize energy consumption of smart devices in a home environment.

The system combines authentication, device management, real-time energy tracking, analytics, scheduling and energy policy enforcement into one working web application.

---

## System Workflow

1. User or Admin logs into the system  
2. Users register and manage smart home devices  
3. Device usage generates real-time energy data  
4. Analytics converts energy data into insights  
5. Schedulers automate device operations  
6. Admin policies enforce energy limits automatically  

This creates a complete end-to-end smart energy ecosystem.

---

## Core Features

### Authentication and Role Management
- Secure user registration and login  
- Role-based access control (USER / ADMIN)  
- Password reset using email tokens  
- BCrypt password encryption  
- Secure session management  

---

### Smart Device Management
Users can manage their smart devices:
- Add and remove devices  
- Toggle device ON/OFF in real time  
- Track energy consumption per device  
- Monitor device usage levels  

Administrators can:
- View and manage all devices  
- Monitor system activity  
- Control or remove devices if required  

---

### Real-Time Energy Tracking
Energy consumption is continuously calculated based on device power rating and usage duration.

Energy formula:
```
Energy (kWh) = Power Rating × Usage Duration
```

The system stores:
- Device energy usage history  
- User energy consumption records  
- Daily and weekly summaries  
- Data used for analytics and policies  

---

### Analytics and Insights

#### User Analytics
- Weekly energy usage trends  
- Monthly usage trends  
- Device energy comparison  
- Peak usage day detection  
- Energy saving recommendations  

#### Admin Analytics
- Total system energy consumption  
- Top energy consuming devices  
- Active device monitoring  
- Identification of high usage users  
- System optimization recommendations  

---

### Scheduling and Automation
Users can automate device operations using schedules.

Automation behavior:
- Scheduler runs periodically in background  
- Checks active schedules  
- Automatically turns devices ON/OFF at scheduled time  

This reduces manual effort and prevents energy waste.

---

### Admin Energy Policy Enforcement
Administrators can define system-wide energy policies.

Policies include:
- Active time window  
- Energy consumption threshold  
- Policy scope  

The policy scheduler:
- Monitors active devices  
- Detects threshold violations  
- Automatically turns OFF high-consumption devices  
- Logs enforcement actions  

---

### Reporting and Monitoring
The system supports:
- Device energy reports (PDF)  
- User energy reports (PDF)  
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

Automation  
- Spring Scheduler (@Scheduled)

Build Tool  
- Maven

---

## Project Structure

```
src/main/java/com/role/implementation/

config/                 → Security and global configuration
controller/             → Application controllers
model/                  → Entities and domain models
repository/             → JPA repositories
service/                → Business logic

devicemanagement/       → Device management module
energytracking/         → Energy tracking module
analytics/              → Analytics module
automation/             → Scheduling module
adminpolicy/            → Energy policy module
```

---

## How to Run the Application

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

## Roles

USER  
- Manage personal devices  
- View analytics  
- Create automation schedules  

ADMIN  
- Monitor all users and devices  
- View system analytics  
- Create and enforce energy policies  

---

## Conclusion
This repository represents the final integrated implementation of the Smart Home Energy Management System demonstrating a modular, secure and automated Spring Boot application.
