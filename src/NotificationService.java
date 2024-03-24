import java.util.*;

public class NotificationService {
    private final Map <Movie,List<User>> customers;
    public NotificationService(){
        customers= new HashMap<>();
        Arrays.stream(Movie.values()).forEach(movie->customers.put(movie,new ArrayList<>()));
    }

    public void reserve(User user,Movie movieType){

        customers.get(movieType).add(user);
    }
    public void unreserve(User user,Movie movieType){

        customers.get(movieType).remove(user);
    }

    public void notifyUser(Movie movieType){
        System.out.println("Notification: The movie " + movieType.getName() + " in genre " + movieType.getGenre() + " is about to start.");
        customers.get(movieType).forEach(user -> user.update(movieType));
    }

}

