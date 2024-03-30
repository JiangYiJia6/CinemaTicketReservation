import java.util.HashMap;
import java.util.Map;

public class User implements MovieList {
    Cinema cinema;
    private final Map<User, Integer> loyaltyPoints;
    private final String name;
    private final int numofPpl;

    public User(String name, int numofPpl) {
        this.name = name;
        this.numofPpl = numofPpl;
        this.loyaltyPoints = new HashMap<>();
    }

    @Override
    public void update(Movie movie) {
        System.out.println("Hey " + name + ", the movie " +
                movie.getName() + " in genre " + movie.getGenre() + " is about to start.");
    }

    public void reserveMovie(Cinema cinema, int numofPpl){

        this.cinema = cinema;

        System.out.println("You have reserverd "+ cinema.title+" for"+numofPpl);
    }
    public void rateMovie(Movie movie, int score) {
        cinema.rateMovie(movie, score);
        System.out.println("You have rated the movie " + movie.getName() + ": " + score);
    }

    public void earnPoints(int points) {
        loyaltyPoints.put(this, loyaltyPoints.getOrDefault(this, 0) + points);
        System.out.println("You have earned " + points + " loyalty points.");
    }

    public int checkPoints() {
        return loyaltyPoints.getOrDefault(this, 0);
    }

    public String getName() {
        return name;
    }
}