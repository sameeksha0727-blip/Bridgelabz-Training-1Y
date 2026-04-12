package Package2.Collections.OnlineExaminationManagementSystem;

public class Question {
    int id;
    String text;

    public Question(int id, String text) {
        this.id = id;
        this.text = text;
    }

    @Override
    public String toString() {
        return "Q" + id + ": " + text;
    }
}
