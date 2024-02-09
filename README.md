# HarbourEats Application

## Description

HarbourEatsApplication is a Spring Boot application designed to manage courier quests and achievements within a courier delivery system. It allows couriers to track their current quest progress and view their achievements.

## API Endpoints

The application defines the following RESTful endpoints:

- **GET /couriers/{courierId}/current-quest**  
  Retrieves the current quest progress for the specified courier.

- **GET /couriers/{courierId}/achievements**  
  Retrieves the achievements for the specified courier.

### Examples

- To get the current quest progress of a courier with ID `courier123`, use the following command:

    ```bash
    curl http://localhost:8080/couriers/courier123/current-quest
    ```

- To get the achievements of a courier with ID `courier123`, use the following command:

    ```bash
    curl http://localhost:8080/couriers/courier123/achievements
    ```