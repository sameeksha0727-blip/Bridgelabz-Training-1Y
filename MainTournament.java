package Package2.Collections.SportsTournamentScheduler;

public class MainTournament {
    public static void main(String[] args) {

        TournamentSystem system = new TournamentSystem();

        Team t1 = new Team(1, "Team A");
        Team t2 = new Team(2, "Team B");
        Team t3 = new Team(3, "Team C");

        system.registerTeam(t1);
        system.registerTeam(t2);
        system.registerTeam(t3);
        system.registerTeam(t1);

        system.scheduleMatch(new Match(t1, t2));
        system.scheduleMatch(new Match(t2, t3));

        system.processMatches();
        system.showLeaderboard();
    }
}
