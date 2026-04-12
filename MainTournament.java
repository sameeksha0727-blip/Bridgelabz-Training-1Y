package Package2.Collections.OnlineGamingTournamentTracker;

public class MainTournament {
    public static void main(String[] args) {

        TournamentSystem system = new TournamentSystem();

        Player p1 = new Player(1, "Aman");
        Player p2 = new Player(2, "Riya");
        Player p3 = new Player(3, "Raj");

        system.registerPlayer(p1);
        system.registerPlayer(p2);
        system.registerPlayer(p3);
        system.registerPlayer(p1);

        system.scheduleMatch(new Match(p1, p2));
        system.scheduleMatch(new Match(p2, p3));

        system.processMatches();
        system.showLeaderboard();
    }
}
