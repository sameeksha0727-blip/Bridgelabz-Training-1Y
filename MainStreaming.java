package Package2.Collections.OnlineStreamingWatchHistory;

public class MainStreaming {
    public static void main(String[] args) {

        StreamingSystem system = new StreamingSystem();

        Movie m1 = new Movie("Avengers", "Action");
        Movie m2 = new Movie("Titanic", "Romance");
        Movie m3 = new Movie("Kis Kisko Pyar Karun 2", "Comedy");

        system.addMovie(m1);
        system.addMovie(m2);
        system.addMovie(m3);

        system.addToQueue(m1);
        system.addToQueue(m3);

        system.watchMovie();
        system.watchMovie();

        system.recommend();
    }
}
