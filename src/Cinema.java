import java.util.*;

public class Cinema {
    private final NotificationService notificationService;
    private final Map<Movie, List<String>> movieRatings;

    String title,showtime;
     int salle;

     public Cinema(){

         notificationService =new NotificationService();
         movieRatings = new HashMap<>();
     }

     public void Notify(Movie movieType){
         notificationService.notifyUser(movieType);

     }

    public NotificationService getNotificationService(){
         return notificationService;

    }


    public void upload(String title,String showtime,int salle){
        this.title=title;
        this.showtime=showtime;
        this.salle=salle;

    }
    public void rateMovie(Movie movieType, int score) {
        if (movieRatings.containsKey(movieType)) {
            movieRatings.get(movieType).add(String.valueOf(score));
        } else {
            List<String> Scores = new ArrayList<>();
            Scores.add(String.valueOf(score));
            movieRatings.put(movieType, Scores);
        }
    }


    public List<String> getMovieRatings(Movie movieType) {

        return movieRatings.getOrDefault(movieType, Collections.emptyList());

    }
}
