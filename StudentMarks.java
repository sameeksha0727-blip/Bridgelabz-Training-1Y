import java.util.ArrayList;

public class StudentMarks {
    public static void main(String[] args) {

        Object[] marks = {"85", 95, Integer.valueOf(88), "null", "abc"};

        ArrayList<Integer> validMarks = new ArrayList<>();

        for (Object mark : marks) {

            try {
                if (mark instanceof String) {

                    String value = (String) mark;

                    if (!value.equals("null")) {
                        validMarks.add(Integer.parseInt(value));
                    }

                } else if (mark instanceof Integer) {
                    validMarks.add((Integer) mark);
                }

            } catch (NumberFormatException e) {
                System.out.println("Invalid mark: " + mark);
            }
        }

        int sum = 0;

        for (Integer mark : validMarks) {
            sum += mark;
        }

        double average = (double) sum / validMarks.size();

        System.out.println("Average Marks = " + average);
    }
}
