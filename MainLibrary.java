package Package2.Collections.LibraryManagementSystem;

public class MainLibrary {
    public static void main(String[] args) {

        LibrarySystem lib = new LibrarySystem();

        Book b1 = new Book("Java Basics");
        Book b2 = new Book("DSA");

        lib.addBook(b1);
        lib.addBook(b2);

        lib.registerMember("M1");
        lib.registerMember("M1");

        lib.requestBook(b1);
        lib.issueBook();

        lib.returnBook(b1);
        lib.reissueRecent();
    }
}
