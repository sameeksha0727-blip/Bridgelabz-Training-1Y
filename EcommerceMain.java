package ecommerce;

import java.util.*;

public class EcommerceMain {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Electronics(1, "Laptop", 50000));
        products.add(new Clothing(2, "Shirt", 2000));

        for (Product p : products) {
            double tax = (p instanceof Taxable) ?
                    ((Taxable) p).calculateTax() : 0;

            double finalPrice =
                    p.getPrice() + tax - p.calculateDiscount();

            System.out.println("Final Price: " + finalPrice);
        }
    }
}

