package Package2.Collections.ECommerceOrderProcessingSystem;

public class Main {
    public static void main(String[] args) {

        OrderSystem system = new OrderSystem();

        system.addOrder(new Order(1, "Aman"));
        system.addOrder(new Order(2, "Riya"));
        system.addOrder(new Order(3, "Raj"));
        system.addOrder(new Order(2, "Duplicate"));

        system.removeDuplicates();
        system.processOrders();
        system.retryFailedOrders();
    }
}
