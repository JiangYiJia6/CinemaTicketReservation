import java.util.*;

public class Cinema {
    private final NotificationService notificationService;
    private final Map<Movie, List<Integer>> movieRatings;

    private final Map<String, Double> ticketPrices;

    String title,showtime;
    int salle;

    double price;

    public Cinema() {
        notificationService = new NotificationService();
        movieRatings = new HashMap<>();

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

    public Map<String, Movie> recommendMoviesByGenre(String genre) throws ErrorGenre {
        Map<String, Movie> recommendedMoviesGenre = new HashMap<>();
        for (Movie movie : movieRatings.keySet()) {
            if (movie.getGenre().equalsIgnoreCase(genre)) {
                recommendedMoviesGenre.put(movie.getName(), movie);
            }
        }

        if (!recommendedMoviesGenre.isEmpty()) {
            System.out.println("Recommended movies in the " + genre + " genre:");
            for (String movieName : recommendedMoviesGenre.keySet()) {
                System.out.println(movieName);
            }
            return recommendedMoviesGenre;
        }

        throw new ErrorGenre("No movie in the '" + genre + "' genre");
    }


    public Map<String, Movie> recommendMoviesByAge(int age) throws ErrorAge {
        Map<String, Movie> recommendedMoviesAge = new HashMap<>();
        for (Movie movie : movieRatings.keySet()) {
            if (age<=18) {
                recommendedMoviesAge.put(movie.getName(), movie);
            }
        }

        if (!recommendedMoviesAge.isEmpty()) {
            System.out.println("Recommended movies for age " + age + ":");
            for (String movieName : recommendedMoviesAge.keySet()) {
                System.out.println(movieName);

            }
            return recommendedMoviesAge;
        }  throw new ErrorAge("no movie in this age");


    }

}