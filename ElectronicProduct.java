public class ElectronicProduct extends Product {

    private String brand;

    public ElectronicProduct(int id, String name, String brand) {
        super(id, name);
        this.brand = brand;
    }

    @Override
    public boolean isMatch(String keyword) {
        return productName.contains(keyword) || brand.equalsIgnoreCase(keyword);
    }
}
