public class Contact {

    protected String name;
    protected String phoneNumber;

    public Contact(String name, String phone) {
        this.name = name;
        this.phoneNumber = phone;
    }

    public void display() {
        System.out.println("Name: " + name + ", Phone: " + phoneNumber);
    }
}
