package Package2.Collections.CustomerFeedbackAnalysis;

import java.util.*;

public class FeedbackSystem {

    List<String> feedbackList = new ArrayList<>();
    Set<String> uniqueFeedback = new HashSet<>();
    Queue<String> feedbackQueue = new LinkedList<>();
    Stack<String> recentStack = new Stack<>();

    public void addFeedback(String msg) {
        feedbackList.add(msg);
    }

    public void processFeedback() {
        uniqueFeedback.addAll(feedbackList);
        feedbackQueue.addAll(uniqueFeedback);

        System.out.println("\nProcessing Feedback:");

        while (!feedbackQueue.isEmpty()) {
            String f = feedbackQueue.poll();
            System.out.println("Processing: " + f);

            recentStack.push(f);
        }
    }

    public void showRecent(int n) {
        System.out.println("\nRecent Feedback:");

        int count = 0;
        Stack<String> temp = new Stack<>();
        temp.addAll(recentStack);

        while (!temp.isEmpty() && count < n) {
            System.out.println(temp.pop());
            count++;
        }
    }
}
