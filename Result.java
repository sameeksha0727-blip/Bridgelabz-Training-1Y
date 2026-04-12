package Package2.Collections.SportsTournamentScheduler;

public class Result {
    Match match;
    Team winner;

    public Result(Match match, Team winner) {
        this.match = match;
        this.winner = winner;
    }

    @Override
    public String toString() {
        return match + " -> Winner: " + winner.name;
    }
}
