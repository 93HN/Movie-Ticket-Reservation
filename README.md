# Movie Ticket Booking System

This is a Java application for booking movie tickets built with Spring Boot and PostgreSQL. It allows users to view available movies, book tickets, and manage their accounts.

## Technologies Used

<img src="https://github.com/abhi9720/BankingPortal-API/assets/68281476/31896d20-16d9-4fe1-a534-0490841de4b9" alt="image" height="100">
<img src="https://github.com/abhi9720/BankingPortal-API/assets/68281476/c09bc4ac-c0ca-4f7c-9c6e-8eb9818eb35b" alt="image" height="100">
<img src="https://github.com/abhi9720/BankingPortal-API/assets/68281476/78c75fff-e8a8-49c6-9897-34b08b2c9308" alt="image" height="100">
<img src="https://github.com/abhi9720/BankingPortal-API/assets/68281476/3647613e-1d6e-4bc4-98b6-2da5648659f9" alt="image" height="100">
<img src="https://github.com/abhi9720/BankingPortal-API/assets/68281476/8a5c0b00-776b-444e-bc24-36fc6bfe4c41" alt="image" height="50">
<img src="https://github.com/abhi9720/BankingPortal-API/assets/68281476/b56a7167-6a3a-49a0-8b8a-8a4e3e71a383" alt="image" height="70">
<img src="https://github.com/abhi9720/BankingPortal-API/assets/68281476/b5c86e65-cbe8-400a-afeb-895846601da7" alt="image"  height="100">

<!--
- Java Spring Boot Framework
- Spring Security for authentication
- JWT (JSON Web Token) for secure API authentication
- MySQL for data storage
- Hibernate for object-relational mapping
- Maven for project management
- Postman for API testing
-->

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
