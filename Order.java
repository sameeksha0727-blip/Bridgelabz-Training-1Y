package Package2.Collections.ECommerceOrderProcessingSystem;

public class Order {
    int orderId;
    String customerName;

    public Order(int orderId, String customerName) {
        this.orderId = orderId;
        this.customerName = customerName;
    }

    public int getOrderId() {
        return orderId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Order)) return false;
        Order order = (Order) o;
        return orderId == order.orderId;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(orderId);
    }

    @Override
    public String toString() {
        return "OrderID: " + orderId + ", Name: " + customerName;
    }
}
