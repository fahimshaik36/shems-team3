# Smart Home Energy Management System (SHEMS)

A full-stack Spring Boot web application for monitoring, controlling, automating and optimizing smart home energy consumption.

This project demonstrates a modular, secure and production-style Java web application built using Spring Boot, Spring Security and MySQL.

---

## Project Overview

Smart homes contain multiple electrical devices that consume energy continuously.  
This system provides a centralized platform to:

- Monitor real-time energy usage  
- Control smart devices remotely  
- Analyze energy consumption trends  
- Automate device operations  
- Enforce energy saving policies  

The application follows a **modular architecture** where each feature is developed as an independent module and then integrated into a final system.

---

## Key Features

### User Features
- Secure registration and login
- Add and manage smart devices
- Turn devices ON and OFF remotely
- View real-time energy consumption
- Analyze weekly and monthly energy trends
- Create automation schedules for devices

### Administrator Features
- Monitor all users and devices
- View system-wide energy analytics
- Identify high energy consumption
- Enforce energy usage policies
- Generate energy reports

---

## System Modules

| Module | Description |
|---|---|
| Role Based Authentication | Login, registration and security |
| Smart Device Management | Device control and ownership |
| Real-Time Energy Tracking | Energy calculation and storage |
| Analytics Dashboard | Data visualization and insights |
| Scheduling and Automation | Automatic device control |
| Final Integrated System | Complete working application |

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

## Repository Structure

```
shems-team3
│
├── Module_1_RoleBasedAuthentication
├── Module_2_Device_Management
├── Module_3_Energy_Tracking
├── Module_4_Analytics_Dashboard
├── Module_5_Scheduling_And_Automation
└── SHEMS_Final_Integrated_System
```

---

## Running the Final Application

1. Create database
```
CREATE DATABASE shems;
```

2. Navigate to the final integrated module
```
cd SHEMS_Final_Integrated_System
```

3. Run the application
```
mvn spring-boot:run
```

4. Open in browser
```
http://localhost:8080
```

---

## Project Highlights

- Modular Spring Boot architecture  
- Role-based security using Spring Security  
- Real-time energy monitoring  
- Background schedulers for automation  
- Analytics and reporting features  
- Production-style project structure  

---

## License
MIT License
