package Package2.Collections.SportsTournamentScheduler;

import java.util.*;

public class TournamentSystem {

    Set<Team> teams = new HashSet<>();
    Queue<Match> matchQueue = new LinkedList<>();
    List<Result> results = new ArrayList<>();
    TreeSet<Team> leaderboard = new TreeSet<>();

    public void registerTeam(Team t) {
        if (teams.add(t)) {
            leaderboard.add(t);
        } else {
            System.out.println("Duplicate team: " + t.name);
        }
    }

    public void scheduleMatch(Match m) {
        matchQueue.add(m);
    }

    public void processMatches() {
        System.out.println("\nProcessing Matches:");

        while (!matchQueue.isEmpty()) {
            Match m = matchQueue.poll();

            Team winner = Math.random() > 0.5 ? m.t1 : m.t2;

            winner.points += 10;

            results.add(new Result(m, winner));

            System.out.println(m + " -> Winner: " + winner.name);
        }

        updateLeaderboard();
    }

    private void updateLeaderboard() {
        leaderboard.clear();
        leaderboard.addAll(teams);
    }

    public void showLeaderboard() {
        System.out.println("\nLeaderboard:");
        for (Team t : leaderboard) {
            System.out.println(t);
        }
    }
}
