# 📚 Bookstore Management System

A simple **console-based Bookstore Management System** developed using **Java Procedural Programming**. This project was created as part of **Task 2** to demonstrate how a bookstore management system can be implemented without using custom Object-Oriented Programming (OOP) classes and objects.

## 📌 Project Overview

The Bookstore Management System is designed for a small local bookstore. The application provides basic functionality for managing books and handling customer purchases through a simple menu-driven console interface.

The system allows users to view available books, select books for purchase, purchase multiple books during the same session, calculate the total purchase value, and generate a simple invoice.

The implementation intentionally follows the **procedural programming paradigm**, where the application is organised around functions and shared data rather than objects representing real-world entities.

## 🎯 Task 2 – Procedural Programming

The main objective of Task 2 is to demonstrate the practical use of procedural programming concepts using Java.

The system does not use custom classes such as `Book`, `Customer`, or `Invoice`. Instead, related book information is stored using separate `ArrayList` collections and manipulated through static methods.

The main programming concepts demonstrated in this project include:

* ☕ Java programming
* 📦 ArrayList collections
* ⌨️ Scanner for user input
* 🔄 Loops
* 🔀 Conditional statements
* 🎛️ Switch statements
* ⚙️ Static methods
* 🧮 Basic calculations
* ✅ Input validation
* 🖥️ Console-based menu system
* 🧩 Procedural programming

## 📚 Book Data Management

Book information is stored using three separate `ArrayList` collections:

```java
static ArrayList<String> bookTitles = new ArrayList<>();
static ArrayList<String> bookAuthors = new ArrayList<>();
static ArrayList<Double> bookPrices = new ArrayList<>();
```

The same index is used to connect the title, author, and price of each book.

For example:

```text
bookTitles[0]  → Clean Code
bookAuthors[0] → Robert C. Martin
bookPrices[0]  → 4500.00
```

This approach demonstrates how related information can be managed using parallel data structures in procedural programming.

Purchased books are stored separately using:

```java
static ArrayList<Integer> purchasedBooks = new ArrayList<>();
```

The selected book indexes are then used to retrieve the relevant book information and calculate the total bill.

## ✨ Main Features

### 📖 Display Available Books

The system displays all available books with their book number, title, author, and price.

Example:

```text
===== BOOK INVENTORY =====

1. Clean Code | Author: Robert C. Martin | Price: Rs. 4500.00
2. Effective Java | Author: Joshua Bloch | Price: Rs. 5500.00
3. Head First Java | Author: Kathy Sierra | Price: Rs. 4000.00
4. Java: The Complete Reference | Author: Herbert Schildt | Price: Rs. 6000.00
```

### 🛒 Purchase Books

Users can select a book by entering its book number. The selected book is added to the current purchase.

The system allows users to purchase multiple books within the same session.

### 💰 Calculate Total Bill

The system calculates the total cost of all selected books using the `calculateTotal()` method.

```java
static double calculateTotal()
```

The method loops through the purchased book indexes and adds the corresponding book prices.

### 🧾 Generate Invoice

The system generates a simple invoice containing the purchased books, authors, individual prices, and the final total bill.

Example:

```text
========== INVOICE ==========

Purchased Books:

- Clean Code by Robert C. Martin - Rs. 4500.00
- Effective Java by Joshua Bloch - Rs. 5500.00

-----------------------------
Total Bill: Rs. 10000.00
=============================
```

### 🔄 Menu-Driven Interface

The application provides a simple main menu that allows users to select different operations.

```text
======================================
       BOOKSTORE MANAGEMENT SYSTEM
======================================

1. Display Books
2. Purchase Book
3. Generate Invoice
4. Exit

Enter your choice:
```

A `switch` statement is used to control the main application flow.

### ⚠️ Input Validation

The system validates the selected book number before adding it to the purchase.

For example:

```java
if (bookNumber < 1 || bookNumber > bookTitles.size()) {
    System.out.println("\nInvalid book number.");
    return;
}
```

This prevents invalid book numbers from being processed.

## 🧩 Main Methods

The application is divided into several static methods, with each method responsible for a specific operation.

| Method               | Description                                  |
| -------------------- | -------------------------------------------- |
| `addBook()`          | Adds a new book to the inventory             |
| `displayBooks()`     | Displays all available books                 |
| `purchaseBook()`     | Adds a selected book to the current purchase |
| `calculateTotal()`   | Calculates the total purchase value          |
| `generateInvoice()`  | Generates the customer invoice               |
| `displayBooksMenu()` | Controls the book display menu               |
| `purchaseMenu()`     | Controls the purchase process                |
| `invoiceMenu()`      | Controls the invoice menu                    |
| `main()`             | Controls the overall program flow            |

## 📚 Sample Book Inventory

The application starts with the following sample books:

| No. | Book Title                      | Author           |        Price |
| --- | ------------------------------- | ---------------- | -----------: |
| 1   | 📘 Clean Code                   | Robert C. Martin | Rs. 4,500.00 |
| 2   | 📗 Effective Java               | Joshua Bloch     | Rs. 5,500.00 |
| 3   | 📙 Head First Java              | Kathy Sierra     | Rs. 4,000.00 |
| 4   | 📕 Java: The Complete Reference | Herbert Schildt  | Rs. 6,000.00 |

## 🛠️ Technologies Used

**Programming Language:** Java

**Development Approach:** Procedural Programming

**Data Structure:** ArrayList

**Input Handling:** Scanner

**Application Type:** Console Application

**Build Tool:** Maven

## 📂 Project Structure

```text
BookStore_without_oop/
│
├── .idea/
│
├── src/
│   └── main/
│       └── java/
│           └── org/
│               └── example/
│                   └── Main.java
│
├── .gitignore
├── pom.xml
└── README.md
```

## ▶️ How to Run

### 1. Clone the Repository

```bash
git clone https://github.com/adeeshabhanukahettiarachchi-hub/BookStore_without_oop.git
```

### 2. Open the Project

Open the cloned project using an IDE such as IntelliJ IDEA, Eclipse, or Visual Studio Code.

### 3. Run the Application

Navigate to:

```text
src/main/java/org/example/Main.java
```

Run the `main()` method.

## 🖥️ Example Program Flow

```text
======================================
       BOOKSTORE MANAGEMENT SYSTEM
======================================

1. Display Books
2. Purchase Book
3. Generate Invoice
4. Exit

Enter your choice: 2
```

After selecting the purchase option, the available books are displayed:

```text
===== PURCHASE BOOK =====

1. Clean Code | Author: Robert C. Martin | Price: Rs. 4500.00
2. Effective Java | Author: Joshua Bloch | Price: Rs. 5500.00
3. Head First Java | Author: Kathy Sierra | Price: Rs. 4000.00
4. Java: The Complete Reference | Author: Herbert Schildt | Price: Rs. 6000.00

Enter book number to purchase: 1
```

The selected book is then added to the purchase:

```text
Clean Code added to purchase.
```

The user can continue purchasing another book or return to the main menu.

## 🧠 Procedural Programming Approach

In this project, the program is structured around functions that perform specific operations on shared data.

For example:

```text
                 ┌────────────────────┐
                 │      main()        │
                 │   Main Menu        │
                 └─────────┬──────────┘
                           │
            ┌──────────────┼──────────────┐
            │              │              │
            ▼              ▼              ▼
      Display Books   Purchase Books   Invoice
            │              │              │
            ▼              ▼              ▼
      Book Lists      Purchased List   calculateTotal()
                                           │
                                           ▼
                                      Total Bill
```

The application therefore focuses on procedures and functions rather than creating objects to represent books or customers.

## ⚖️ Procedural Programming vs Object-Oriented Programming

This project intentionally avoids custom OOP classes and objects.

In the procedural implementation, book information is separated into different lists:

```text
Book Titles
     +
Book Authors
     +
Book Prices
     ↓
Static Methods
```

In an Object-Oriented implementation, the same information could be represented using a `Book` class:

```text
Book
├── title
├── author
└── price
```

The OOP approach would group related data and behaviour into objects, which can make larger applications easier to organise and maintain.

Therefore, this procedural implementation provides a useful foundation for comparing procedural programming with the Object-Oriented implementation developed in **Task 3**.

## 🎓 Academic Purpose

This project demonstrates the practical application of procedural programming concepts in Java.

Through this implementation, the following concepts are demonstrated:

* 📌 Procedural programming
* 📌 Data structures
* 📌 Java methods
* 📌 ArrayList
* 📌 Loops
* 📌 Conditional statements
* 📌 Switch statements
* 📌 User input
* 📌 Input validation
* 📌 Menu-driven programming
* 📌 Basic calculations
* 📌 Invoice generation

The project also provides a practical basis for understanding the limitations of procedural programming and the advantages that Object-Oriented Programming can provide for larger and more complex systems.

## 🚀 Future Improvements

The system could be extended in the future with additional functionality such as:

* 🔢 Quantity management
* 🔎 Book search functionality
* 🗑️ Remove books from purchase
* 📦 Book stock management
* 👤 Customer management
* 💳 Payment processing
* 💾 Database integration
* 🧱 Object-Oriented implementation
* 🖥️ Graphical User Interface
* 📊 Sales and inventory reports

## 👨‍💻 Author

**Adeesha Bhanuka Hettiarachchi**

GitHub: `adeeshabhanukahettiarachchi-hub`

## 📄 License

This project was developed for **educational and academic purposes**.

---

⭐ **Bookstore Management System – Java Procedural Programming**
