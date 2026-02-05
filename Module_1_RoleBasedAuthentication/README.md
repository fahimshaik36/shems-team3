# Smart Home Energy Management System (SHEMS)

A role-based Smart Home Energy Management System developed using Spring Boot that enables secure smart device control, real-time energy monitoring, automation, analytics, and reporting for efficient energy management.

---

## Project Overview

The Smart Home Energy Management System (SHEMS) is a Java-based web application designed to monitor and optimize energy consumption in smart homes. The system allows users to manage smart devices, track energy usage, automate device schedules, and analyze consumption patterns through dashboards. Administrators can monitor system-wide usage, identify high-consumption patterns, and generate reports.

The application follows a modular, scalable architecture and implements real-world security, automation, and analytics concepts.

---

## Objectives

- Monitor real-time energy consumption
- Reduce energy wastage using automation
- Provide analytics-driven insights
- Ensure secure authentication and authorization
- Support administrative monitoring and reporting

---

## System Modules

### Authentication & Security Module
- User registration and login
- Role-based access control (USER / ADMIN)
- Password encryption using BCrypt
- Forgot password with email-based reset token
- Secure session handling using Spring Security

---

### Smart Device Management Module
- Add, view, update, and delete smart devices
- Device ON/OFF control
- Role-based device visibility
- Safe deletion with dependency cleanup
- Device attributes: name, type, location, power rating

---

### Real-Time Energy Tracking Module
- Device-wise energy consumption tracking
- User-wise energy aggregation
- Daily energy usage calculation
- Electricity cost estimation
- Peak usage detection

---

### Analytics Dashboard Module

User Analytics:
- Last 7 days energy trend
- Monthly energy usage
- Device-wise comparison
- Peak usage day
- Energy-saving recommendations

Admin Analytics:
- System-wide energy consumption
- Top energy-consuming devices
- Active and inactive device statistics
- High-usage user detection
- Smart system recommendations

---

### Scheduling & Automation Module
- Device ON/OFF scheduling
- Enable or disable schedules
- Background automation using Spring Scheduler
- Automatic device state management

---

### Reporting Module
- Device-wise energy usage reports (PDF)
- User-wise energy and cost reports (PDF)
- Admin-level downloadable reports

---

## Technology Stack

Backend      : Spring Boot  
Security     : Spring Security, BCrypt  
ORM          : Spring Data JPA (Hibernate)  
Database     : MySQL  
Frontend     : Thymeleaf, HTML, CSS  
Scheduling  : Spring Scheduler  
Reporting   : iText PDF  
Build Tool  : Maven  

---

## Database Design (Overview)

- User → Devices (One-to-Many)
- Device → EnergyUsage (One-to-Many)
- Device → DeviceSchedule (One-to-Many)
- User → PasswordResetToken (One-to-One)

The database is normalized and maintains proper referential integrity.

---

## How to Run the Project

Prerequisites:
- Java 17 or higher
- Maven
- MySQL
- IDE (IntelliJ IDEA / Eclipse / VS Code)

Steps:
1. Clone the repository  
   git clone https://github.com/<your-username>/<your-repository-name>.git

2. Configure MySQL credentials in application.properties

3. Run the application  
   mvn spring-boot:run

4. Open the application in browser  
   http://localhost:8080

---

## Roles & Permissions

USER:
- Manage own devices
- View energy analytics
- Schedule device automation

ADMIN:
- Manage all users and devices
- View system-wide analytics
- Generate PDF reports

---

## Project Highlights

- Real-world Spring Boot application
- Role-based authentication and authorization
- Automation using background schedulers
- Analytics-driven energy optimization
- Transaction-safe database operations
- Clean and modular architecture

---

## Author

Fahim Shaik  
B.Tech - Computer Science
Aspiring Software Engineer | Java | Spring Boot

---

## License

This project is developed for academic and learning purposes.
