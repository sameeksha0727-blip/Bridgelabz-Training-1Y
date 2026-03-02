public class Book {

    protected int bookId;
    protected String title;
    protected double price;

    static String libraryName = "City Central Library";

    public Book(int bookId, String title, double price) {
        this.bookId = bookId;
        this.title = title;
        this.price = price;
    }

    public double calculateFine(int daysLate) {
        return 0;
    }
}
