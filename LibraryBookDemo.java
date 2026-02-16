package com.gla.constructors;

class Book {
    String title;
    String author;
    double price;
    boolean availability;

    Book(String t, String a, double p) {
        title = t;
        author = a;
        price = p;
        availability = true;
    }

    void borrowBook() {
        if (availability) {
            availability = false;
            System.out.println("Book borrowed successfully.");
        } else {
            System.out.println("Book is not available.");
        }
    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Available: " + availability);
    }
}

public class LibraryBookDemo {
    public static void main(String[] args) {
        Book b = new Book("OOP in Java", "James", 550);
        b.display();
        b.borrowBook();
        b.display();
    }
}

