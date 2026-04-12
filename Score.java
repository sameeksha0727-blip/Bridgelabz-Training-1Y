package Package2.Collections.OnlineGamingTournamentTracker;

public class Score implements Comparable<Score> {
    Player player;
    int points;

    public Score(Player player, int points) {
        this.player = player;
        this.points = points;
    }

    @Override
    public int compareTo(Score s) {
        return s.points - this.points;
    }

    @Override
    public String toString() {
        return player + " : " + points;
    }
}
