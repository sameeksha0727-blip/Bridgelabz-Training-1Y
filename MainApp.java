package question5;

import library.books.*;
import library.members.*;
import library.transactions.*;

public class MainApp {
    public static void main(String[] args) {
        Book b = new Book("Java Programming");
        Member m = new Member("Suhani");
        Transaction t = new Transaction();

        b.display();
        m.display();
        t.issueBook(b, m);
    }
}
