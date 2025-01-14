# Event Management System

This is a full-stack Event Management System with three microservices: Event, Location, and RSVP. It includes a Spring Boot backend and a React frontend. The system allows users to manage events, locations, and RSVPs efficiently.

## Features
- **Backend (Spring Boot)**
  - Event service for managing events.
  - Location service for managing locations.
  - RSVP service for managing RSVPs.
  - REST API endpoints for Create, Read, Update, and Delete (CRUD) operations.
  - Communication between services using REST.

- **Frontend (React)**
  - User-friendly interface for managing events, locations, and RSVPs.
  - Dynamic forms for creating and updating data.
  - Real-time data display using Axios.

---

## Requirements

### Prerequisites
Ensure you have the following installed on your system:
- [Java 17+](https://www.oracle.com/java/technologies/javase-jdk17-downloads.html)
- [Node.js (v18 or above)](https://nodejs.org/)
- [MySQL](https://dev.mysql.com/downloads/)
- [Maven](https://maven.apache.org/install.html)

---

## Setup Instructions

### 1. Clone the Repository
```bash
git clone https://github.com/<your-repository-name>.git
cd <your-repository-name>
```

### 2. Backend Setup
1. Navigate to the backend folder:
    ```bash
    cd backend
    ```

2. Configure the database:
   - Open the `application.properties` file located in `src/main/resources`.
   - Update the database configuration to match your local MySQL setup:
     ```properties
     spring.datasource.url=jdbc:mysql://localhost:3306/event_management
     spring.datasource.username=your_username
     spring.datasource.password=your_password
     spring.jpa.hibernate.ddl-auto=update
     ```

3. Create the database in MySQL:
    ```sql
    CREATE DATABASE event_management;
    ```

4. Run the Spring Boot application:
    ```bash
    mvn spring-boot:run
    ```

The backend will start on `http://localhost:8081`.

---

### 3. Frontend Setup
1. Navigate to the frontend folder:
    ```bash
    cd ../frontend
    ```

2. Install dependencies:
    ```bash
    npm install
    ```

3. Start the React development server:
    ```bash
    npm start
    ```

The frontend will start on `http://localhost:3000`.

---

## Usage

1. Open the browser and navigate to `http://localhost:3000`.
2. Use the navigation bar to access the following pages:
   - **Events**: Create and view events.
   - **Locations**: Create and view locations.
   - **RSVPs**: Create and view RSVPs.
3. Perform CRUD operations directly from the frontend.

---

## API Endpoints

### Event Service (`/api/events`)
- `GET /api/events`: Get all events.
- `POST /api/events`: Create a new event.

### Location Service (`/api/locations`)
- `GET /api/locations`: Get all locations.
- `POST /api/locations`: Create a new location.

### RSVP Service (`/api/rsvps`)
- `GET /api/rsvps`: Get all RSVPs.
- `POST /api/rsvps`: Create a new RSVP.

---

## Project Structure

### Backend
- `src/main/java`: Java source code.
  - `controller`: REST controllers.
  - `model`: JPA entity models.
  - `service`: Business logic.
  - `repository`: Data access layer.
- `src/main/resources`: Configuration files.

### Frontend
- `src/components`: React components.
  - `EventService.js`: Handles events.
  - `LocationService.js`: Handles locations.
  - `RSVPService.js`: Handles RSVPs.
- `src/App.js`: Main React application file.
- `src/index.js`: React DOM rendering.

---

## Notes
- Ensure the backend is running before interacting with the frontend.
- Use Postman or a similar tool to test API endpoints independently if needed.
