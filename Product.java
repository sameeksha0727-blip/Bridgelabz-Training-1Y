package Package2.Collections.InventoryandRestockManagementSystem;

public class Product {
    String name;
    double price;
    int stock;

    public Product(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    @Override
    public String toString() {
        return name + " | ₹" + price + " | Stock: " + stock;
    }
}
