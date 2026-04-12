package Package2.Collections.LibraryManagementSystem;

import java.util.*;

public class LibrarySystem {

    List<Book> books = new ArrayList<>();
    Set<String> members = new HashSet<>();
    Queue<Book> issueQueue = new LinkedList<>();
    Stack<Book> returnStack = new Stack<>();

    public void addBook(Book b) {
        books.add(b);
    }

    public void registerMember(String id) {
        if (!members.add(id)) {
            System.out.println("Duplicate Member: " + id);
        }
    }

    public void requestBook(Book b) {
        issueQueue.add(b);
    }

    public void issueBook() {
        if (!issueQueue.isEmpty()) {
            Book b = issueQueue.poll();
            System.out.println("Issued: " + b);
        }
    }

    public void returnBook(Book b) {
        returnStack.push(b);
        System.out.println("Returned: " + b);
    }

    public void reissueRecent() {
        if (!returnStack.isEmpty()) {
            Book b = returnStack.pop();
            System.out.println("Re-issued: " + b);
        }
    }
}