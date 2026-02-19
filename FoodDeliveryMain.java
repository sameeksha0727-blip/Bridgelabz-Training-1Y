package fooddelivery;

import java.util.*;

public class FoodDeliveryMain {
    public static void main(String[] args) {

        List<FoodItem> order = new ArrayList<>();
        order.add(new VegItem("Paneer", 200, 2));
        order.add(new NonVegItem("Chicken", 300, 1));

        for (FoodItem item : order) {
            item.getItemDetails();   // Polymorphism
        }
    }
}

