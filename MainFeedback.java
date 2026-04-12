package Package2.Collections.CustomerFeedbackAnalysis;

public class MainFeedback {
    public static void main(String[] args) {

        FeedbackSystem system = new FeedbackSystem();

        system.addFeedback("Good service");
        system.addFeedback("Fast delivery");
        system.addFeedback("Good service");

        system.processFeedback();
        system.showRecent(2);
    }
}
