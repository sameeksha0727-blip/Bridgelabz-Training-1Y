class Ticket extends Thread {
    private int id;
    private String type;

    public Ticket(int id, String type) {
        this.id = id;
        this.type = type;
    }

    public void run() {
        try {
            int time = (int)(Math.random() * 5 + 1);

            System.out.println("Ticket " + id + " (" + type +
                    ") started by " + getName());

            Thread.sleep(time * 1000);

            System.out.println("Ticket " + id + " completed in " +
                    time + " sec");
        } catch (Exception e) {}
    }
}

public class TicketSystem {
    public static void main(String[] args) {
        Ticket t1 = new Ticket(1, "Critical");
        Ticket t2 = new Ticket(2, "Feature");
        Ticket t3 = new Ticket(3, "Query");
        Ticket t4 = new Ticket(4, "Feedback");

        t1.setPriority(10);
        t2.setPriority(4);
        t3.setPriority(2);
        t4.setPriority(1);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
