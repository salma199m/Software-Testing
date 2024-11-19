# Selenium Login Automation with TestNG and POM

This project is an end-to-end test automation suite for validating the functionality of a login page. It simulates various user actions such as signing in, resetting passwords, and logging out while verifying the application's behavior under different scenarios. The framework is built using Selenium WebDriver for browser automation and TestNG for managing test execution. It also employs the Page Object Model (POM) design pattern for better scalability and maintainability.

---

## Key Features
### 1. **Login Functionality Testing**
- Automates the process of logging in with valid and invalid credentials.
- Verifies if the application correctly identifies authorized and unauthorized users.

### 2. **Password Reset Functionality**
- Simulates the "Forgot Password" feature.
- Automates the entry of username, email, and phone number to retrieve/reset the password.
- Extracts the temporary password provided and verifies login with the new credentials.

### 3. **Logout Verification**
- Tests the logout functionality and ensures the application correctly navigates the user to the expected page.

### 4. **Data-Driven Testing**
- Implements TestNG’s `@DataProvider` annotation to test the login functionality with multiple sets of input data, ensuring thorough test coverage.

### 5. **Explicit Waits**
- Utilizes Selenium’s explicit wait mechanism to handle dynamically loaded elements like buttons, forms, and messages.

### 6. **Assertions for Validation**
- Includes assertions to validate key functionalities, such as verifying user login success, the appearance of temporary passwords, and logout button visibility.

---

## Tools and Technologies Used
- **Programming Language**: Java
- **Automation Framework**: Selenium WebDriver
- **Test Execution**: TestNG
- **Design Pattern**: Page Object Model (POM)
- **Dependency Management**: Maven
- **Browser**: Chrome (via ChromeDriver)
- **WebDriver Management**: WebDriverManager

---

## Detailed Project Structure
```plaintext
src/
├── main/
│   ├── java/
│   │   └── Pages/                # Contains all Page Object Model classes
│   │       ├── HomePage.java     # Handles the Home Page (Logout functionality)
│   │       ├── Forgot_Password.java # Manages Forgot Password actions
│   │       ├── Reset_Password.java  # Handles extracting temporary password
│   │       └── Sign_In.java      # Manages login actions
├── test/
│   ├── java/
│   │   └── Login.java            # Main test class that integrates all pages
