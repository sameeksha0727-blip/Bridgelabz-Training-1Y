package Package2.Collections.SportsTournamentScheduler;

public class Team implements Comparable<Team> {
    int id;
    String name;
    int points;

    public Team(int id, String name) {
        this.id = id;
        this.name = name;
        this.points = 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Team)) return false;
        return id == ((Team) o).id;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(id);
    }

    @Override
    public int compareTo(Team t) {
        return t.points - this.points;
    }

    @Override
    public String toString() {
        return name + " | Points: " + points;
    }
}
