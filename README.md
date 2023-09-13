# User Management Web Application (Spring Boot)

## Description

This is a User Management web application built with Spring Boot. It allows you to manage user accounts, including registration, authentication, and basic profile management.

## Features

- **User Registration**: Users can sign up for an account.
- **User Authentication**: Registered users can log in.
- **Profile Management**: Users can update their profile information.
- **User Listing**: Admins can view a list of all users.
- **User Roles**: Different user roles (e.g., admin, regular user) with appropriate permissions.

## Technologies

- **Spring Boot**: Application framework
- **Spring Security**: Authentication and access-control framework
- **Spring Data JPA**: Database access framework
- **MySQL**: Database
- **Thymeleaf**: Template engine
- **Bootstrap**: CSS framework

## Getting Started

### Prerequisites

- Java 8
- Maven
- MySQL

### Installation

1. Clone the repository:

   ```bash
   git clone git@github.com:roshni73/SpringBoot_UserManagement.git
    ```
2. Create a MySQL database named `UserManagementDb` (or whatever you want to name it).
3. Create a file named `application.properties` in the `src/main/resources` directory.
4. Add the following lines to `application.properties`:

   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/UserManagementDb
   spring.datasource.username=<username>
   spring.datasource.password=<password>

   spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect
   spring.jpa.hibernate.ddl-auto=update
   ```
5. Replace `<username>` and `<password>` with your MySQL username and password, respectively.
6. Run the application with Maven:

   ```bash
   mvn spring-boot:run
   ```
7. Open your browser and go to `http://localhost:8080`.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

## Acknowledgements

- [Spring Boot](https://spring.io/projects/spring-boot)
- [Spring Security](https://spring.io/projects/spring-security)
- [Spring Data JPA](https://spring.io/projects/spring-data-jpa)
- [Thymeleaf](https://www.thymeleaf.org/)
- [Bootstrap](https://getbootstrap.com/)
- [Sb Admin 2](https://startbootstrap.com/themes/sb-admin-2/)
