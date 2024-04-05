import java.util.*;

public class NotificationService {
    private final Map<Movier, Stack<User>> customers;

    public NotificationService() {
        customers = new HashMap<>();
    }

    public void notifyUsers(Movier movier) {
        System.out.println("Notification: The movie " + movier.getMovie() + " is about to start.");
        Stack<User> stack = customers.getOrDefault(movier, new Stack<>());
        stack.forEach(user -> user.update(movier));
    }

    public void reserve(User user, Movier movier) {
        customers.computeIfAbsent(movier, k -> new Stack<>()).push(user);
        System.out.println("Reservation successful for user: " + user.getName() + " for movie: " + movier.getMovie());
    }

    public void unreserve(User user, Movier movier) {
        Stack<User> stack = customers.getOrDefault(movier, new Stack<>());
        if (stack.contains(user)) {
            stack.remove(user);
            System.out.println("Reservation canceled for user: " + user.getName() + " for movie: " + movier.getMovie());
        } else {
            System.out.println("No reservation found for user: " + user.getName() + " for movie: " + movier.getMovie());
        }
    }
}