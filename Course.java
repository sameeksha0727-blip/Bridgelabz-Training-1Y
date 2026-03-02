public class Course {

    protected int courseId;
    protected String courseName;
    protected double price;
    static String platformName = "LearnHub";

    public Course(int id, String name, double price) {
        this.courseId = id;
        this.courseName = toTitleCase(name);
        this.price = price;
    }

    public double getFinalPrice() {
        return price;
    }

    private String toTitleCase(String str) {
        String[] words = str.split(" ");
        String result = "";
        for (String w : words) {
            result += w.substring(0,1).toUpperCase()
                    + w.substring(1).toLowerCase() + " ";
        }
        return result.trim();
    }
}
