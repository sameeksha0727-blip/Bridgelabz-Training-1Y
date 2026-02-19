package library;

import java.util.*;

public class LibraryMain {
    public static void main(String[] args) {

        List<LibraryItem> items = new ArrayList<>();
        items.add(new Book(1, "Java Basics", "James"));

        for (LibraryItem item : items) {
            item.getItemDetails();   // Polymorphism
        }
    }
}

