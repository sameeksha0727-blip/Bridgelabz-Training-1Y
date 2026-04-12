package Package2.Collections.WarehouseDeliveryTrackingSystem;

public class PackageItem {
    String id;
    String name;

    public PackageItem(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return id + " | " + name;
    }
}
