import java.util.*;

public class Cinema {
    private final NotificationService notificationService;
    private final Map<Movier, List<Integer>> movieRatings;
    private Map<String, Movie> movies = new HashMap<>();
    private final Map<String, Double> ticketPrices;

    String title,showtime;
    Movier movier;

    public Cinema() {
        notificationService = new NotificationService();
        movieRatings = new HashMap<>();
        movies.put("Spider Man", new Movie());
        movies.put("Star War", new Movie());
        ticketPrices=new HashMap<>();
    }

    public void Notify(Movier movier) {
        notificationService.notifyUsers(movier);
    }

    public NotificationService getNotificationService() {
        return notificationService;
    }

    public void upload(Movier movier){
        this.movier=movier;

    }

    public void rateMovie(Movier movier, int score) {
        movieRatings.computeIfAbsent(movier, rate -> new ArrayList<>()).add(score);
        System.out.println("Rating added for movie: " + movier.getMovie() + ", Rating: " + score);
    }

    public List<Integer> getMovieRatings(Movier movie) {
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