# UserManagementSystem

## Framework and Language Used

- Framework: Spring Boot
- Language: Java

## Data Flow

- **User Input:**
  - Users interact with the system through defined endpoints.
  - Input data includes UserId, username, DateOfBirth, email, Phone Number, Date, and Time.

- **Processing:**
  - The system processes user requests through the specified endpoints.
  - Data validation and business logic are applied during processing.

- **Storage:**
  - User data is stored in a data structure Map for persistent storage.

- **Response:**
  - The system provides appropriate responses based on the user's request.

## Data Structure Used in Project

- The project utilizes a HashMap to store user information.
- Entity structure includes fields for UserId, username, DateOfBirth, email, Phone Number, Date, and Time.

## Project Summary

### User Attributes

- UserId
- username
- DateOfBirth
- email
- Phone Number
- Date
- Time

### Endpoints

1. **addUser**
   - Add a new user with the specified attributes.

2. **getUser/{userid}**
   - Retrieve user information based on the provided UserId.

3. **getAllUser**
   - Retrieve information for all users in the system.

4. **updateUserInfo**
   - Update user information with the specified attributes.

5. **deleteUser**
   - Delete a user based on the provided UserId.

## Getting Started

Follow the steps outlined in the documentation to set up and run the User Management System locally.

## Dependencies

- Spring Boot
- Spring Web
- Spring Data JPA

