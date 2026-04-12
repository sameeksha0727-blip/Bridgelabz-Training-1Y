package Package3.Map;

import java.util.*;

public class LibraryCatalog {

    public static void main(String[] args) {

        Map<String, String> catalog = new HashMap<>();

        catalog.put("978-111", "Java Basics");
        catalog.put("978-222", "Data Structures");
        catalog.put("978-333", "Operating Systems");

        String isbn = "978-222";
        if (catalog.containsKey(isbn)) {
            System.out.println("Book: " + catalog.get(isbn));
        } else {
            System.out.println("Book not found");
        }

        catalog.remove("978-111");

        System.out.println("\nCatalog (Sorted):");
        Map<String, String> sorted = new TreeMap<>(catalog);

        for (Map.Entry<String, String> entry : sorted.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        String searchTitle = "Data Structures";
        boolean found = false;

        for (Map.Entry<String, String> entry : catalog.entrySet()) {
            if (entry.getValue().equalsIgnoreCase(searchTitle)) {
                System.out.println("\nFound ISBN: " + entry.getKey());
                found = true;
            }
        }

        if (!found) {
            System.out.println("\nTitle not found");
        }
    }
}
