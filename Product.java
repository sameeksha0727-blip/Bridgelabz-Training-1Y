public class Product {

    protected int productId;
    protected String productName;

    public Product(int productId, String productName) {
        this.productId = productId;
        this.productName = productName;
    }

    public boolean isMatch(String keyword) {
        return productName.contains(keyword);
    }
}
