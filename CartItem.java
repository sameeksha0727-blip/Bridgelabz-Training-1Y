package com.gla.level2;

public class CartItem {

    // Attributes
    String itemName;
    double price;
    int quantity;

    // Constructor
    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Add item
    public void addItem(int qty) {
        quantity += qty;
        System.out.println(qty + " item(s) added.");
    }

    // Remove item
    public void removeItem(int qty) {
        if (qty <= quantity) {
            quantity -= qty;
            System.out.println(qty + " item(s) removed.");
        } else {
            System.out.println("Not enough quantity to remove.");
        }
    }

    // Display total cost
    public void displayTotalCost() {
        double total = price * quantity;
        System.out.println("Item: " + itemName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + total);
    }

    public static void main(String[] args) {
        CartItem item = new CartItem("Laptop", 50000, 1);

        item.addItem(2);
        item.removeItem(1);
        item.displayTotalCost();
    }
}

