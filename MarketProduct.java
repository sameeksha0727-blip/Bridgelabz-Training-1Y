package Package1.Generics;

class MarketProduct<T> {
    private T category;
    private double price;

    public MarketProduct(T category, double price) {
        this.category = category;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public T getCategory() {
        return category;
    }
}

class Marketplace {

    public static void applyDiscount(MarketProduct<?> product, double percentage) {
        double newPrice = product.getPrice() - (product.getPrice() * percentage / 100);
        product.setPrice(newPrice);
    }

    public static void main(String[] args) {
        MarketProduct<String> book = new MarketProduct<>("Books", 500);

        applyDiscount(book, 10);

        System.out.println("Category: " + book.getCategory());
        System.out.println("Price after discount: " + book.getPrice());
    }
}