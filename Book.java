package library;

public class Book extends LibraryItem implements Reservable {

    private boolean available = true;

    public Book(int id, String title, String author) {
        super(id, title, author);
    }

    public int getLoanDuration() {
        return 14;
    }

    public void reserveItem(String borrowerName) {
        if (available) {
            available = false;
            System.out.println(getTitle() + " reserved by " + borrowerName);
        }
    }

    public boolean checkAvailability() {
        return available;
    }
}

