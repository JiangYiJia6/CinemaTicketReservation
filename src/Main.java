import java.util.List;
import java.util.Scanner;
import java.util.Set;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws ErrorGenre, ErrorAge {
        Scanner scanner = new Scanner(System.in);
        SpiderManBuilder spiderManBuilder=new SpiderManBuilder();
        Movier movier1=new Movier((IBuilder) spiderManBuilder);
        movier1.createMovie();
        movier1.getMovie().display();

        StarWarBuilder starWarBuilder=new StarWarBuilder();
        Movier movier2=new Movier((IBuilder) starWarBuilder);
        movier2.createMovie();
        movier2.getMovie().display();


        //Movie spiderMan = new Movie("Spider-Man", "Action",12);
        //Movie starWar = new Movie("Star Wars", "Science Fiction",18);
        //Movie killBill = new Movie("Kill Bill", "Action",18);

        Cinema cinema = new Cinema();
        cinema.upload(movier1);
        cinema.upload(movier2);
        System.out.println("Enter how many people you want to reserve");
        int people = Integer.parseInt(scanner.nextLine());
        User user1 = new User("Tom",people);
        User user2 = new User("Alex",people);

        user1.reserveMovie(cinema,people);
        user2.reserveMovie(cinema,people);
        user1.earnPoints(1);
        user2.earnPoints(1);




        cinema.getNotificationService().reserve(user1,movier1);
        cinema.getNotificationService().reserve(user2, movier2);

        cinema.getNotificationService().unreserve(user2,movier2);
        Seat seat=new Seat(10,20);
        System.out.println("a row you want to seat");
        int row = Integer.parseInt(scanner.nextLine());
        System.out.println("a collunm you want to seat");
        int col = Integer.parseInt(scanner.nextLine());
        seat.bookSeat(row,col);
        seat.displaySeats();
        cinema.Notify(movier1);

        user1.rateMovie(movier1,5);
        cinema.getMovieRatings(movier1);



        System.out.println("Enter a genre for movie recommendation(Action/Science Fiction):");
        String genre = scanner.nextLine();
        cinema.recommendMoviesByGenre(genre);

        System.out.println("Enter a age for movie recommendation:");
        String age = scanner.nextLine();
        cinema.recommendMoviesByAge(Integer.parseInt(age));

        Employee e1=new Employee(123);
        e1.takeAttendace(user1,people);
        e1.takePirces(movier1,9.99,people);
        e1.reducePrice(user1,people,movier1,9.99);










    }
}