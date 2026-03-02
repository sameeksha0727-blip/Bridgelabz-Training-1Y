public class BusinessContact extends Contact {

    private String companyName;

    public BusinessContact(String name, String phone, String company) {
        super(name, phone);
        this.companyName = company;
    }

    @Override
    public void display() {
        System.out.println("Name: " + name.toUpperCase() +
                ", Phone: " + phoneNumber +
                ", Company: " + companyName);
    }
}
