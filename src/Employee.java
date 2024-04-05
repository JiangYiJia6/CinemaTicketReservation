import java.util.*;

public class Employee {


    private final Map<User, List<Integer>> attendance;
    private final Map<Movier, List<Double>> moviePrice;
    private final int EmpId;

    public Employee(int EmpId) {
        this.EmpId = EmpId;
        attendance = new HashMap<>();
        moviePrice= new HashMap<Movier, List<Double>>();
    }
    public void takeAttendace(User user,int attend){
        attendance.put(user, Collections.singletonList(attend));
        System.out.println(" " + user.getName() + " came as  " + attend+" person");
    }
    public void takePirces(Movier movier,double price,int numofPlp){

        double pay = price * numofPlp;
        moviePrice.put(movier, Collections.singletonList(price));
        System.out.println(movier.getMovie() + " costs " + price + " dollars. You need to pay " + pay + " in total.");
    }
    public void reducePrice(User user,int numofPlp,Movier movier,double price){
        if (numofPlp>1){
            double pay = price+ price * (numofPlp-1);
            System.out.println(movier.getMovie() + " costs " + price + " dollars. You need to pay " + pay + " in total.");
        }

    }

}
