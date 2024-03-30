import java.util.*;

public class NotificationService {
    private final Map<Movie, Stack<User>> customers;

    public NotificationService() {
        customers = new HashMap<>();
    }

    public void notifyUsers(Movie movie) {
        System.out.println("Notification: The movie " + movie.getName() + " in genre " + movie.getGenre() + " is about to start.");
        Stack<User> stack = customers.getOrDefault(movie, new Stack<>());
        stack.forEach(user -> user.update(movie));
    }

    public void reserve(User user, Movie movie) {
        customers.computeIfAbsent(movie, k -> new Stack<>()).push(user);
        System.out.println("Reservation successful for user: " + user.getName() + " for movie: " + movie.getName());
    }

    public void unreserve(User user, Movie movie) {
        Stack<User> stack = customers.getOrDefault(movie, new Stack<>());
        if (stack.contains(user)) {
            stack.remove(user);
            System.out.println("Reservation canceled for user: " + user.getName() + " for movie: " + movie.getName());
        } else {
            System.out.println("No reservation found for user: " + user.getName() + " for movie: " + movie.getName());
        }
    }
}