import java.util.*;

public class Cinema {
    private final NotificationService notificationService;
    private final Map<Movie, List<Integer>> movieRatings;
    private Map<String, Movie> movies = new HashMap<>();
    private final Map<String, Double> ticketPrices;

    String title,showtime;
    int salle;

    double price;

    public Cinema() {
        notificationService = new NotificationService();
        movieRatings = new HashMap<>();
        movies.put("Spider Man", new Movie("Spider Man", "Action", 12));
        movies.put("Star War", new Movie("Star War", "Science Fiction", 18));
        ticketPrices=new HashMap<>();
    }

    public void Notify(Movie movie) {
        notificationService.notifyUsers(movie);
    }

    public NotificationService getNotificationService() {
        return notificationService;
    }

    public void upload(String title,String showtime,int salle,double price){
        this.title=title;
        this.showtime=showtime;
        this.salle=salle;
        this.price=price;

    }

    public void rateMovie(Movie movie, int score) {
        movieRatings.computeIfAbsent(movie, rate -> new ArrayList<>()).add(score);
        System.out.println("Rating added for movie: " + movie.getName() + ", Rating: " + score);
    }

    public List<Integer> getMovieRatings(Movie movie) {
        return movieRatings.getOrDefault(movie, Collections.emptyList());
    }

    public Map<String, Movie> recommendMoviesByGenre(String genre) {
        Map<String, Movie> recommendedMovies = new HashMap<>();
        for (Map.Entry<String, Movie> entry : movies.entrySet()) {
            if (entry.getValue().getGenre().equals(genre)) {
                recommendedMovies.put(entry.getKey(), entry.getValue());
            }
        }
        return recommendedMovies;

    }


    public Map<String, Movie> recommendMoviesByAge(int age) {
        Map<String, Movie> recommendedMovies = new HashMap<>();
        for (Map.Entry<String, Movie> entry : movies.entrySet()) {
            if (entry.getValue().getAge() <= age) {
                recommendedMovies.put(entry.getKey(), entry.getValue());
            }
        }
        return recommendedMovies;
    }
}