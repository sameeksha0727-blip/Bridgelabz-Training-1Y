package Package2.Collections.CourierDeliveryRoutingSystem;

public class MainCourier {
    public static void main(String[] args) {

        CourierSystem system = new CourierSystem();

        system.addParcel(new Parcel("P1", 8));
        system.addParcel(new Parcel("P2", 3));
        system.addParcel(new Parcel("P1", 5));

        system.assignDelivery();
        system.showCompleted();
    }
}
