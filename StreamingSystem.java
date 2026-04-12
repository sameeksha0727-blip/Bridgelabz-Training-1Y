package Package2.Collections.OnlineStreamingWatchHistory;

import java.util.*;

public class StreamingSystem {

    Stack<Movie> history = new Stack<>();
    List<Movie> allMovies = new ArrayList<>();
    Set<String> genres = new HashSet<>();
    Queue<Movie> upNext = new LinkedList<>();

    public void addMovie(Movie m) {
        allMovies.add(m);
    }

    public void addToQueue(Movie m) {
        upNext.add(m);
    }

    public void watchMovie() {
        if (!upNext.isEmpty()) {
            Movie m = upNext.poll();

            history.push(m);
            genres.add(m.genre);

            System.out.println("Watched: " + m);
        }
    }

    public void recommend() {
        System.out.println("\nRecommended Movies:");

        for (Movie m : allMovies) {
            if (genres.contains(m.genre)) {
                System.out.println(m);
            }
        }
    }
}
