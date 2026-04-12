package Package2.Collections.InventoryandRestockManagementSystem;

public class MainInventory {
    public static void main(String[] args) {

        InventorySystem system = new InventorySystem();

        system.addProduct(new Product("Milk", 50, 5));
        system.addProduct(new Product("Bread", 30, 2));
        system.addProduct(new Product("Milk", 50, 5));

        system.showProducts();

        system.checkLowStock(6);
        system.restockProducts();

        system.undoRestock();

        system.showProducts();
    }
}
