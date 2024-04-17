# File Encryption and Management System

## **Description:**

The Secure File Management System with OTP Authentication is a Java-based application designed to provide users with a secure environment for managing their files. The system implements OTP (One-Time Password) authentication for user registration and login, ensuring an additional layer of security. Users can perform various operations such as viewing hidden files, hiding new files, and unhiding previously hidden files. The system maintains user data securely in a MySQL database and ensures the confidentiality of files through encryption.

## **Features:**

1. **User Authentication**: Users can sign up and log in securely to access the system.
2. **File Encryption**: Users can encrypt their files to ensure that they are protected from unauthorized access.
3. **File Hiding**: Users can hide their files within the application, making them inaccessible to other users or applications.
4. **File Management**: Users can view a list of their encrypted and hidden files, unhide files when needed, and manage their file collection.
5. **OTP-based Authentication**: The system employs OTP (One-Time Password) authentication during sign up and log in processes to enhance security.
6. **Email Notification**: Users receive OTPs via email for authentication purposes, ensuring secure communication.

## **Installation:**

1. **Clone Repository:** Clone the repository from GitHub using the provided URL.
2. **Set up MySQL Database:** Create a MySQL database named **`fileEncryption`** and execute the SQL script provided in the repository to create the necessary tables.
3. **Configure Database Connection:** Update the database connection settings in the **`MyConnection.java`** file to match your MySQL server configuration.
4. **Compile and Run:** Compile the Java files using any Java IDE or command-line tools and run the **`Main.java`** file to start the application.

## **Technologies Used:**

- Java
- MySQL
- JavaMail API (for sending OTP emails)
- JDBC (Java Database Connectivity)

## **Project Structure:**

- Overview of the project structure, including package organization and file hierarchy.
- **Main**: Entry point of the application.
- **DAO (Data Access Object)**: Handles database interactions and operations.
- **Service**: Contains business logic for file encryption, user authentication, and OTP generation.
- **Views**: User interfaces for interacting with the system.
- **Model**: Defines the data models used in the application.
- **DB**: Manages database connections and configurations.

## **Code Overview:**

- Explanation of key classes and their responsibilities:
    - **`Main.java`**: Entry point of the application.
    - **`Welcome.java`**: Handles user authentication and navigation.
    - **`UserDAO.java`**, **`UserService.java`**: Manages user data and database interactions.
    - **`SendOTPService.java`**: Sends OTP emails for user verification.
    - **`DataDAO.java`**: Manages file data and database interactions.
    - **`UserView.java`**: Provides user interface for file management.
    - **`MyConnection.java`**: Establishes database connection.
    - **`Data.java`**: Represents file data model.

## **Contributing:**

- Contributions are welcome! Please open a pull request on GitHub if you have any changes or improvements to the project.

## **License:**

- The project is licensed under the MIT license.

## **Conclusion:**

Secure File Management System with OTP Verification offers a secure and convenient way for users to manage their files while ensuring data integrity and confidentiality. By leveraging OTP verification via email, the application enhances user authentication and mitigates security risks associated with unauthorized access to files.
