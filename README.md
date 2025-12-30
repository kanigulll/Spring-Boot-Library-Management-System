# Library Management System

**Student Name:** Kani [Soyadını Buraya Yaz]
**Course:** Advanced Programming

##  Description
This project is a web-based Library Management System developed using **Spring Boot** and **Thymeleaf**. It allows users to manage a library inventory with capabilities to **Add**, **List**, and **Delete** books. The application uses an in-memory **H2 Database** for easy setup and testing.

##  Technologies Used
- **Backend:** Java 17, Spring Boot (Web, Data JPA)
- **Frontend:** Thymeleaf, HTML5, Bootstrap 4
- **Database:** H2 Database (In-Memory)
- **Build Tool:** Maven
- **IDE:** Eclipse

##  How to Run
1. **Import:** Open Eclipse and import the project as an "Existing Maven Project".
2. **Install:** Right-click on the project -> `Run As` -> `Maven install`.
3. **Run:** Find `DemoApplication.java` in `src/main/java/com/kani/demo` and run it as a Java Application.
4. **Access:** Open your browser and go to `http://localhost:8080/`.

##  Features
- **View Books:** Displays a list of all books with Title, Author, and ISBN.
- **Add Book:** A form to register new books into the system.
- **Delete Book:** Remove a book from the inventory.

##  Database Access
To view the database records directly:
- **URL:** `http://localhost:8080/h2-console`
- **JDBC URL:** `jdbc:h2:mem:testdb`
- **User Name:** `sa`
- **Password:** (Leave empty)
