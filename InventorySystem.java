package Package2.Collections.InventoryandRestockManagementSystem;

import java.util.*;

public class InventorySystem {

    Set<String> productNames = new HashSet<>();
    List<Product> products = new ArrayList<>();
    Queue<Product> restockQueue = new LinkedList<>();
    Stack<Product> restockStack = new Stack<>();

    public void addProduct(Product p) {
        if (productNames.add(p.name)) {
            products.add(p);
        } else {
            System.out.println("Duplicate product: " + p.name);
        }
    }

    public void checkLowStock(int threshold) {
        for (Product p : products) {
            if (p.stock < threshold) {
                restockQueue.add(p);
            }
        }
    }

    public void restockProducts() {
        System.out.println("\nRestocking:");

        while (!restockQueue.isEmpty()) {
            Product p = restockQueue.poll();
            p.stock += 10;

            restockStack.push(p);

            System.out.println("Restocked: " + p);
        }
    }

    public void undoRestock() {
        if (!restockStack.isEmpty()) {
            Product p = restockStack.pop();
            p.stock -= 10;

            System.out.println("Undo Restock: " + p);
        }
    }

    public void showProducts() {
        System.out.println("\nAll Products:");
        for (Product p : products) {
            System.out.println(p);
        }
    }
}
