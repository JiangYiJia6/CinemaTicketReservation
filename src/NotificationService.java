import java.util.*;

public class NotificationService {
    private final Map <Movie,Stack<User>> customers;
    public NotificationService(){
        customers= new HashMap<>();
        Arrays.stream(Movie.values()).forEach(movie->customers.put(movie,new Stack<>()));
    }

    public void reserve(User user,Movie movieType){
        Stack<User> stack = customers.get(movieType);
        stack.push(user);
        System.out.println("Reservation successful for user: " + user.getName() + " for movie: " + movieType.getName());

        //customers.get(movieType).add(user);
    }
    public void unreserve(User user,Movie movieType){
        Stack<User> stack = customers.get(movieType);
        if(stack.contains(user)){
            stack.remove(user);
            System.out.println("Reservation canceled for user: " + user.getName() + " for movie: " + movieType.getName());
        } else {
            System.out.println("No reservation found for user: " + user.getName() + " for movie: " + movieType.getName());
        }


    }

    public void notifyUser(Movie movieType){
        System.out.println("Notification: The movie " + movieType.getName() + " in genre " + movieType.getGenre() + " is about to start.");
        Stack<User> stack = customers.get(movieType);
        stack.forEach(user -> user.update(movieType));
    }

}

