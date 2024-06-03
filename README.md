# Movie Ticket Booking System

This is a Java application for booking movie tickets built with Spring Boot and PostgreSQL. It allows users to view available movies, book tickets, and manage their accounts.

## Technologies Used

<img src="https://github.com/abhi9720/BankingPortal-API/assets/68281476/31896d20-16d9-4fe1-a534-0490841de4b9" alt="image" height="70"> <img src="https://github.com/abhi9720/BankingPortal-API/assets/68281476/c09bc4ac-c0ca-4f7c-9c6e-8eb9818eb35b" alt="image" height="70"> <img src="https://1000logos.net/wp-content/uploads/2020/09/Java-Logo.png" alt="image"  height="70"> <img src="https://cdn.icon-icons.com/icons2/2699/PNG/512/postgresql_vertical_logo_icon_168900.png" alt="image" height="70"> <img src="https://github.com/abhi9720/BankingPortal-API/assets/68281476/8a5c0b00-776b-444e-bc24-36fc6bfe4c41" alt="image" height="40"> <img src="https://github.com/abhi9720/BankingPortal-API/assets/68281476/b56a7167-6a3a-49a0-8b8a-8a4e3e71a383" alt="image" height="70"> <img src="https://github.com/abhi9720/BankingPortal-API/assets/68281476/b5c86e65-cbe8-400a-afeb-895846601da7" alt="image"  height="70">


<!--
- Java Spring Boot Framework
- Spring Security for authentication
- JWT (JSON Web Token) for secure API authentication
- MySQL for data storage
- Hibernate for object-relational mapping
- Maven for project management
- Postman for API testing
-->

## Database diagram, Entities and Relationships
<img width="1178" alt="Captura de Tela 2024-06-03 às 19 16 05" src="https://github.com/93HN/Movie-Ticket-Reservation/assets/8496232/0f3539eb-2821-40ad-9901-5880ebeeda6e">

**Accounts**: This entity represents the user accounts registered in the system. It contains information about each user, such as their ID, name, email, password, and the date when the account was created. Users can create accounts, log in, and manage their personal information through this entity.

**Movies**: Represented as a table in the database, containing information about each movie such as its title, synopsis, and ID. Each movie can be associated with one or more screening rooms where it will be shown.

**Screening Rooms**: Another table in the database, storing details about the screening rooms available in your cinema, including the room's ID, name, and capacity. Each screening room can host multiple screenings of different movies.

**Tickets**: This entity represents the tickets purchased by users for specific movie screenings. It includes information like the ticket ID, the ID of the associated movie, the screening room ID, and the date/time when the ticket was booked.


## Features

- **View Movies**: Users can see a list of available movies.
- **Add Movies**: Admins can add new movies to the catalog and attach them to a screening room.
- **Book Tickets**: Users can book tickets for their desired movies.
- **Manage Accounts**: Users can create accounts, login, and manage their personal information.
- **Decrease Empty Spaces**: When users book tickets, it decreases the total number of available spaces in the screening room.


## Getting Started

To run this application locally, follow these steps:

1. Clone this repository to your local machine.
2. Set up a PostgreSQL database and update the application.properties file with your database credentials.
3. Build the project using Maven: `mvn clean package`.
4. Run the application: `java -jar target/movie-ticket-booking-system.jar`.

## Usage

- Visit the homepage to view available movies.
- Create an account or login to book tickets.
- Select a movie and book tickets for the desired showtimes.
- Manage your account settings and view booking history.

## Contributing

Contributions are welcome! If you have any ideas for improvements or new features, feel free to open an issue or submit a pull request.

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details.
