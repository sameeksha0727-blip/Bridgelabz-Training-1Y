package Package2.Collections.ECommerceOrderProcessingSystem;

import java.util.*;

public class OrderSystem {

    List<Order> orderList = new ArrayList<>();
    Set<Order> uniqueOrders = new HashSet<>();
    Queue<Order> orderQueue = new LinkedList<>();
    Stack<Order> failedStack = new Stack<>();

    public void addOrder(Order order) {
        orderList.add(order);
    }

    public void removeDuplicates() {
        uniqueOrders.addAll(orderList);
        orderQueue.addAll(uniqueOrders);
    }

    public void processOrders() {
        System.out.println("Processing Orders:");

        while (!orderQueue.isEmpty()) {
            Order order = orderQueue.poll();

            System.out.println("Processing: " + order);

            if (order.getOrderId() % 2 == 0) {
                System.out.println("Failed: " + order);
                failedStack.push(order);
            }
        }
    }

    public void retryFailedOrders() {
        System.out.println("\nRetrying Failed Orders:");

        while (!failedStack.isEmpty()) {
            Order order = failedStack.pop();
            System.out.println("Reprocessing: " + order);
        }
    }
}
