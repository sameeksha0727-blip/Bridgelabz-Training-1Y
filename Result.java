package Package2.Collections.OnlineGamingTournamentTracker;

public class Result {
    Match match;
    Player winner;

    public Result(Match match, Player winner) {
        this.match = match;
        this.winner = winner;
    }

    @Override
    public String toString() {
        return match + " -> Winner: " + winner;
    }
}
