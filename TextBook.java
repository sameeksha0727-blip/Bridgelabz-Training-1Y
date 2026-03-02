public class TextBook extends Book {

    public TextBook(int bookId, String title, double price) {
        super(bookId, title, price);
    }

    @Override
    public double calculateFine(int daysLate) {
        return daysLate * 2;
    }
}
