package Package3.Map;

import java.util.*;

public class VotingSystem {

    public static void main(String[] args) {

        Map<String, Integer> votes = new HashMap<>();

        String[] voteList = {
                "Aman", "Riya", "Aman", "Raj", "Riya",
                "Aman", "Raj", "Riya", "Riya", "Raj"
        };

        for (String candidate : voteList) {
            votes.put(candidate, votes.getOrDefault(candidate, 0) + 1);
        }

        System.out.println("Vote Count:");
        for (Map.Entry<String, Integer> entry : votes.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        String winner = null;
        int maxVotes = 0;

        for (Map.Entry<String, Integer> entry : votes.entrySet()) {
            if (entry.getValue() > maxVotes) {
                maxVotes = entry.getValue();
                winner = entry.getKey();
            }
        }

        System.out.println("\nWinner: " + winner);
    }
}
