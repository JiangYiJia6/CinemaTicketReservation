import java.util.*;

public class Employee {


    private final Map<User, List<Integer>> attendance;
    private final Map<Movie, List<Double>> moviePrice;
    private final int EmpId;

    public Employee(int EmpId) {
        this.EmpId = EmpId;
        attendance = new HashMap<>();
        moviePrice= new HashMap<>();
    }
    public void takeAttendace(User user,int attend){
        attendance.put(user, Collections.singletonList(attend));
        System.out.println(" " + user.getName() + " came as  " + attend+" person");
    }
    public void takePirces(Movie movie,double price,int numofPlp){

        double pay = price * numofPlp;
        moviePrice.put(movie, Collections.singletonList(price));
        System.out.println(movie.getName() + " costs " + price + " dollars. You need to pay " + pay + " in total.");
    }
    public void reducePrice(User user,int numofPlp,Movie movie,double price){
        if (numofPlp>1){
            double pay = price+ price * (numofPlp-1);
            System.out.println(movie.getName() + " costs " + price + " dollars. You need to pay " + pay + " in total.");
        }

    }

}
