package Package3.Map;

import java.util.*;

public class ShoppingCart {

    public static void main(String[] args) {

        LinkedHashMap<String, Double> cart = new LinkedHashMap<>();

        cart.put("Laptop", 40000.0);
        cart.put("Mouse", 500.0);
        cart.put("Keyboard", 1500.0);

        System.out.println("Cart Items:");
        for (Map.Entry<String, Double> e : cart.entrySet()) {
            System.out.println(e.getKey() + " : ₹" + e.getValue());
        }

        double total = 0;
        for (double price : cart.values()) {
            total += price;
        }

        if (total > 5000) {
            total *= 0.9;
        }

        System.out.println("\nTotal Bill: ₹" + total);

        cart.remove("Mouse");

        System.out.println("\nAfter Removal:");
        cart.forEach((k, v) -> System.out.println(k + " : ₹" + v));
    }
}
