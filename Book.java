package library.books;

public class Book {
    public String title;

    public Book(String title) {
        this.title = title;
    }

    public void display() {
        System.out.println("Book: " + title);
    }
}
