package com.gla.level1;

public class Item {

    // Attributes
    int itemCode;
    String itemName;
    double price;

    // Constructor
    public Item(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    // Method to display item details
    public void displayDetails() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price per Item: " + price);
    }

    // Method to calculate total cost
    public double calculateTotalCost(int quantity) {
        return price * quantity;
    }

    public static void main(String[] args) {
        Item item1 = new Item(201, "Notebook", 50);

        item1.displayDetails();

        int quantity = 5;
        System.out.println("Total Cost for " + quantity + " items: "
                + item1.calculateTotalCost(quantity));
    }
}

