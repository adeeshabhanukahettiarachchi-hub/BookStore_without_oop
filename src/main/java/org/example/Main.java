package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    // Book data stored using separate lists
    static ArrayList<String> bookTitles = new ArrayList<>();
    static ArrayList<String> bookAuthors = new ArrayList<>();
    static ArrayList<Double> bookPrices = new ArrayList<>();

    // Store purchased book indexes
    static ArrayList<Integer> purchasedBooks = new ArrayList<>();


    // Add a book to inventory
    static void addBook(String title, String author, double price) {
        bookTitles.add(title);
        bookAuthors.add(author);
        bookPrices.add(price);
    }


    // Display books
    static void displayBooks() {

        System.out.println("\n===== BOOK INVENTORY =====");

        if (bookTitles.isEmpty()) {
            System.out.println("No books available.");
            return;
        }

        for (int i = 0; i < bookTitles.size(); i++) {

            System.out.println(
                    (i + 1) + ". " +
                            bookTitles.get(i) +
                            " | Author: " +
                            bookAuthors.get(i) +
                            " | Price: Rs. " +
                            String.format("%.2f", bookPrices.get(i))
            );
        }
    }

    // Purchase a book
    static void purchaseBook(int bookNumber) {

        if (bookNumber < 1 || bookNumber > bookTitles.size()) {
            System.out.println("\nInvalid book number.");
            return;
        }

        int index = bookNumber - 1;

        purchasedBooks.add(index);

        System.out.println(
                "\n" + bookTitles.get(index) +
                        " added to purchase."
        );
    }


    // Calculate total bill
    static double calculateTotal() {

        double total = 0;

        for (int index : purchasedBooks) {
            total += bookPrices.get(index);
        }

        return total;
    }


    // Generate invoice
    static void generateInvoice() {

        System.out.println("\n========== INVOICE ==========");

        if (purchasedBooks.isEmpty()) {
            System.out.println("No books purchased.");
            return;
        }

        System.out.println("Purchased Books:");

        for (int index : purchasedBooks) {

            System.out.println(
                    "- " +
                            bookTitles.get(index) +
                            " by " +
                            bookAuthors.get(index) +
                            " - Rs. " +
                            String.format("%.2f", bookPrices.get(index))
            );
        }

        double total = calculateTotal();

        System.out.println("-----------------------------");

        System.out.println(
                "Total Bill: Rs. " +
                        String.format("%.2f", total)
        );

        System.out.println("=============================");
    }


    // ==============================
    // DISPLAY BOOKS MENU
    // ==============================

    static void displayBooksMenu(Scanner scanner) {

        int choice;

        do {

            displayBooks();

            System.out.println("\n0. Back to Main Menu");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();

            if (choice != 0) {
                System.out.println("\nPlease enter 0 to return to Main Menu.");
            }

        } while (choice != 0);
    }


    // ==============================
    // PURCHASE MENU
    // ==============================

    static void purchaseMenu(Scanner scanner) {
        int choice;
        do {
            System.out.println("\n===== PURCHASE BOOK =====");
            displayBooks();
            System.out.println("\n0. Back to Main Menu");
            System.out.print("\nEnter book number to purchase: ");
            choice = scanner.nextInt();
            if (choice == 0) {
                return;
            }
            purchaseBook(choice);
            System.out.println("\n0. Back to Main Menu");
            System.out.println("1. Purchase Another Book");
            System.out.print("Enter your choice: ");
            int nextChoice = scanner.nextInt();
            if (nextChoice == 0) {
                return;
            }
        } while (true);
    }


    // ==============================
    // INVOICE MENU
    // ==============================

    static void invoiceMenu(Scanner scanner) {
        int choice;
        do {
            generateInvoice();
            System.out.println("\n0. Back to Main Menu");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            if (choice != 0) {
                System.out.println("\nInvalid choice. Please enter 0.");
            }
        } while (choice != 0);
    }

    // ==============================
    // MAIN METHOD
    // ==============================

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Add sample books
        addBook(
                "Clean Code",
                "Robert C. Martin",
                4500.00
        );
        addBook(
                "Effective Java",
                "Joshua Bloch",
                5500.00
        );
        addBook(
                "Head First Java",
                "Kathy Sierra",
                4000.00
        );
        addBook(
                "Java: The Complete Reference",
                "Herbert Schildt",
                6000.00
        );
        int choice;


        // ==============================
        // MAIN MENU
        // ==============================

        do {
            System.out.println("\n======================================");
            System.out.println("       BOOKSTORE MANAGEMENT SYSTEM");
            System.out.println("======================================");

            System.out.println("1. Display Books");
            System.out.println("2. Purchase Book");
            System.out.println("3. Generate Invoice");
            System.out.println("4. Exit");

            System.out.print("\nEnter your choice: ");

            choice = scanner.nextInt();


            switch (choice) {
                case 1:
                    displayBooksMenu(scanner);
                    break;
                case 2:
                    purchaseMenu(scanner);
                    break;
                case 3:
                    invoiceMenu(scanner);
                    break;
                case 4:
                    System.out.println(
                            "\nThank you for using the Bookstore Management System."
                    );
                    break;
                default:
                    System.out.println(
                            "\nInvalid choice. Please try again."
                    );
            }
        } while (choice != 4);
        scanner.close();
    }
}