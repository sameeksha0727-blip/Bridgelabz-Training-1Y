public class LiveCourse extends Course {

    public LiveCourse(int id, String name, double price) {
        super(id, name, price);
    }

    @Override
    public double getFinalPrice() {
        return price - (price * 0.05);
    }
}
