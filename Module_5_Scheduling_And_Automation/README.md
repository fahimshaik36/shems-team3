# Module 5 – Scheduling and Automation

## Overview
This module enables automatic control of smart devices using schedules and background schedulers in the Smart Home Energy Management System (SHEMS).

It reduces manual intervention and helps optimize energy usage by automatically turning devices ON and OFF at predefined times.

---

## Purpose of the Module
Users often forget to turn devices off, which leads to energy waste.  
This module solves that problem by allowing users to create schedules that run automatically in the background.

---

## Core Responsibilities
- Create device schedules
- Enable or disable schedules
- Automatically execute schedules
- Update device status based on schedule
- Run background automation using schedulers

---

## Technology Stack
- Java 17
- Spring Boot
- Spring Scheduler (@Scheduled)
- Spring Data JPA
- Thymeleaf
- MySQL
- Maven

---

## Project Structure

```
Module_5_Scheduling_and_Automation
│
├── .mvn/
├── src/
│   ├── main/
│   │   ├── java/com/role/implementation/automation/
│   │   │   ├── controller/
│   │   │   │   └── ScheduleController.java
│   │   │   │
│   │   │   ├── model/
│   │   │   │   └── DeviceSchedule.java
│   │   │   │
│   │   │   ├── repository/
│   │   │   │   └── DeviceScheduleRepository.java
│   │   │   │
│   │   │   ├── service/
│   │   │   │   ├── AutomationService.java
│   │   │   │   └── AutomationSchedulerService.java
│   │   │   │
│   │   │   └── AutomationApplication.java
│   │   │
│   │   └── resources/
│   │       ├── templates/
│   │       │   ├── schedules.html
│   │       │   └── automation.html
│   │       └── application.properties
│   │
├── pom.xml
└── README.md
```

---

## How Scheduling Works
1. User creates a schedule for a device  
2. Scheduler runs periodically in the background  
3. At the scheduled time:
   - Device turns ON automatically  
   - Device turns OFF automatically  

---

## Scheduler Behaviour
The automation scheduler runs at fixed intervals to:
- Check active schedules
- Compare current time with schedule time
- Update device status accordingly

---

## Integration with SHEMS
This module works with:
- Device Management Module (device status)
- Energy Tracking Module (energy optimization)
- Analytics Module (usage insights)

---

## Running the Module
```
mvn spring-boot:run
```

---

## Summary
This module provides automated device control to improve energy efficiency and reduce manual effort.
