class BankUser implements Runnable {
    private String name;
    private String type;

    public BankUser(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(name + " (" + type +
                    ") checking balance | Priority: " +
                    Thread.currentThread().getPriority());

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("Error");
            }
        }
    }
}

public class BankSystem {
    public static void main(String[] args) {
        Thread premium = new Thread(new BankUser("User1", "Premium"));
        Thread regular = new Thread(new BankUser("User2", "Regular"));
        Thread basic = new Thread(new BankUser("User3", "Basic"));

        premium.setPriority(10);
        regular.setPriority(5);
        basic.setPriority(1);

        premium.start();
        regular.start();
        basic.start();
    }
}
