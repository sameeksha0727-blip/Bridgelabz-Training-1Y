public class RecordedCourse extends Course {

    public RecordedCourse(int id, String name, double price) {
        super(id, name, price);
    }

    @Override
    public double getFinalPrice() {
        return price - (price * 0.10);
    }
}
