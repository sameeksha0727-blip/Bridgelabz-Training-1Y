public class CreditCard implements Payment {
    public void pay(double amount) {
        System.out.println("Paid via Credit Card: " + amount);
    }
}
