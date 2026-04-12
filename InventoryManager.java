package Package3.Map;

import java.util.*;

public class InventoryManager {

    public static void main(String[] args) {

        Map<String, Integer> stock = new HashMap<>();

        stock.put("Milk", 10);
        stock.put("Bread", 5);
        stock.put("Eggs", 12);

        String product = "Milk";
        int quantity = stock.getOrDefault(product, 0);

        quantity -= 10;
        if (quantity <= 0) {
            stock.put(product, 0);
        } else {
            stock.put(product, quantity);
        }

        stock.put("Bread", stock.getOrDefault("Bread", 0) + 10);

        String query = "Milk";
        if (stock.containsKey(query)) {
            System.out.println(query + " stock: " + stock.get(query));
        } else {
            System.out.println(query + " not stocked");
        }

        System.out.println("\nOut of Stock:");
        for (Map.Entry<String, Integer> entry : stock.entrySet()) {
            if (entry.getValue() == 0) {
                System.out.println(entry.getKey());
            }
        }
    }
}
