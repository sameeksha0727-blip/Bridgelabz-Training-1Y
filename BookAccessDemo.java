package com.gla.accessmodifier;

class Book {
    public String ISBN;
    protected String title;
    private String author;

    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}

class EBook extends Book {

    public EBook(String ISBN, String title, String author) {
        super(ISBN, title, author);
    }

    void display() {
        System.out.println("ISBN: " + ISBN);    // public
        System.out.println("Title: " + title);  // protected
        System.out.println("Author: " + getAuthor()); // private via getter
    }
}

public class BookAccessDemo {
    public static void main(String[] args) {
        EBook e = new EBook("12345", "Java OOP", "James");
        e.display();
    }
}

