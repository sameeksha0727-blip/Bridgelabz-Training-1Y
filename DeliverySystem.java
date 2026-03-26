class Order implements Runnable {
    private int id;
    private String restaurant;
    private int time;

    public Order(int id, String restaurant, int time) {
        this.id = id;
        this.restaurant = restaurant;
        this.time = time;
    }

    public void run() {
        try {
            System.out.println("Order " + id + " Picked up");
            Thread.sleep(time * 1000);

            System.out.println("Order " + id + " In Transit");
            Thread.sleep(time * 1000);

            System.out.println("Order " + id + " Delivered by " +
                    Thread.currentThread().getName());
        } catch (Exception e) {}
    }
}

public class DeliverySystem {
    public static void main(String[] args) {
        Thread o1 = new Thread(new Order(1, "KFC", 2));
        Thread o2 = new Thread(new Order(2, "Dominos", 3));
        Thread o3 = new Thread(new Order(3, "Pizza Hut", 1));

        o1.setPriority(10);
        o2.setPriority(5);
        o3.setPriority(3);

        o1.start();
        o2.start();
        o3.start();
    }
}
