package Package2.Collections.WarehouseDeliveryTrackingSystem;

public class MainWarehouse {
    public static void main(String[] args) {

        WarehouseSystem system = new WarehouseSystem();

        system.addPackage(new PackageItem("P1", "Item1"));
        system.addPackage(new PackageItem("P2", "Item2"));
        system.addPackage(new PackageItem("P1", "Duplicate"));

        system.processDeliveries();
        system.showSummary();
    }
}
