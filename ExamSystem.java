class Activity extends Thread {
    private String name;
    private int delay;

    public Activity(String name, int delay) {
        this.name = name;
        this.delay = delay;
    }

    public void run() {
        try {
            Thread.sleep(delay);
            System.out.println(name + " started | State: " +
                    Thread.currentThread().getState());
        } catch (Exception e) {}
    }
}

public class ExamSystem {
    public static void main(String[] args) {
        Activity entry = new Activity("Student Entry", 0);
        Activity paper = new Activity("Question Paper", 5000);
        Activity attendance = new Activity("Attendance", 10000);
        Activity collection = new Activity("Answer Collection", 15000);

        paper.setPriority(10);
        attendance.setPriority(8);
        collection.setPriority(7);
        entry.setPriority(5);

        entry.start();
        paper.start();
        attendance.start();
        collection.start();
    }
}
