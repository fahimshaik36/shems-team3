# Module 2 – Smart Device Management

## Overview
This module manages smart home devices within the Smart Home Energy Management System.

It provides device CRUD operations, real-time ON/OFF control, and device ownership management.

---

## Technology Stack
- Java 17
- Spring Boot
- Spring MVC
- Spring Data JPA
- Thymeleaf
- MySQL
- Maven

---

## Key Features
- Add and remove devices
- Assign devices to users
- Toggle device ON/OFF status
- Admin access to all devices

---

## Project Structure

```
Module_2_Device_Management
│
├── .mvn/
├── src/
│   ├── main/
│   │   ├── java/com/role/implementation/devicemanagement/
│   │   │   ├── controller/DeviceController.java
│   │   │   ├── model/Device.java
│   │   │   ├── repository/DeviceRepository.java
│   │   │   ├── service/DeviceService.java
│   │   │   └── service/DeviceServiceImpl.java
│   │   │
│   │   └── resources/
│   │       ├── templates/
│   │       └── application.properties
│
├── pom.xml
└── README.md
```

---

## Running
```
mvn spring-boot:run
```

---

## Role in SHEMS
Provides device data to energy tracking, analytics, automation, and policy modules.
