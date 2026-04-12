package Package2.Collections.OnlineGamingTournamentTracker;

import java.util.*;

public class TournamentSystem {

    Set<Player> players = new HashSet<>();
    Queue<Match> matchQueue = new LinkedList<>();
    List<Result> results = new ArrayList<>();
    TreeSet<Score> leaderboard = new TreeSet<>();

    public void registerPlayer(Player p) {
        if (players.add(p)) {
            leaderboard.add(new Score(p, 0));
        } else {
            System.out.println("Duplicate player: " + p);
        }
    }

    public void scheduleMatch(Match m) {
        matchQueue.add(m);
    }

    public void processMatches() {
        System.out.println("\nProcessing Matches:");

        while (!matchQueue.isEmpty()) {
            Match m = matchQueue.poll();

            Player winner = Math.random() > 0.5 ? m.p1 : m.p2;

            Result r = new Result(m, winner);
            results.add(r);

            updateScore(winner);

            System.out.println(r);
        }
    }

    private void updateScore(Player winner) {
        Score target = null;

        for (Score s : leaderboard) {
            if (s.player.equals(winner)) {
                target = s;
                break;
            }
        }

        if (target != null) {
            leaderboard.remove(target);
            leaderboard.add(new Score(winner, target.points + 10));
        }
    }

    public void showLeaderboard() {
        System.out.println("\nLeaderboard:");
        for (Score s : leaderboard) {
            System.out.println(s);
        }
    }
}
