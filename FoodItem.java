package fooddelivery;

public abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        setPrice(price);
        this.quantity = quantity;
    }

    public String getItemName() { return itemName; }
    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }

    public void setPrice(double price) {
        if (price > 0)
            this.price = price;
    }

    public abstract double calculateTotalPrice();

    public void getItemDetails() {
        System.out.println(itemName +
                " Total: " + calculateTotalPrice());
    }
}

