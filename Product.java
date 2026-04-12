package Package1.Generics;

import java.util.*;

class Product {
    double price;

    public double getPrice() {
        return price;
    }
}

class Mobile extends Product {
    Mobile(double price) { this.price = price; }
}

class Laptop extends Product {
    Laptop(double price) { this.price = price; }
}

class PriceCalculator {
    public static double calculateTotal(List<? extends Product> items) {
        double sum = 0;
        for (Product p : items) {
            sum += p.getPrice();
        }
        return sum;
    }

    public static void main(String[] args) {
        List<Mobile> mobiles = Arrays.asList(new Mobile(10000), new Mobile(20000));
        System.out.println(calculateTotal(mobiles));
    }
}