import java.util.List;
import java.util.Scanner;
import java.util.Set;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws ErrorGenre, ErrorAge {
        Scanner scanner = new Scanner(System.in);
        Movie spiderMan = new Movie("Spider-Man", "Action",12);
        Movie starWar = new Movie("Star Wars", "Science Fiction",18);
        Movie killBill = new Movie("Kill Bill", "Action",18);

        Cinema cinema = new Cinema();
        cinema.upload("spider man", "7:00 PM", 1,9.99);
        cinema.upload("star war","8:00PM",1,10.99);
        System.out.println("Enter how many people you want to reserve");
        int people = Integer.parseInt(scanner.nextLine());
        User user1 = new User("Tom",people);
        User user2 = new User("Alex",people);

        user1.reserveMovie(cinema,people);
        user2.reserveMovie(cinema,people);
        user1.earnPoints(1);
        user2.earnPoints(1);




        cinema.getNotificationService().reserve(user1,spiderMan);
        cinema.getNotificationService().reserve(user2, starWar);

        cinema.getNotificationService().unreserve(user2,spiderMan);
        Seat seat=new Seat(10,20);
        System.out.println("a row you want to seat");
        int row = Integer.parseInt(scanner.nextLine());
        System.out.println("a collunm you want to seat");
        int col = Integer.parseInt(scanner.nextLine());
        seat.bookSeat(row,col);
        seat.displaySeats();
        cinema.Notify(spiderMan);

        user1.rateMovie(spiderMan,5);
        cinema.getMovieRatings(spiderMan);



        System.out.println("Enter a genre for movie recommendation(Action/Science Fiction):");
        String genre = scanner.nextLine();
        cinema.recommendMoviesByGenre(genre);

        System.out.println("Enter a age for movie recommendation:");
        String age = scanner.nextLine();
        cinema.recommendMoviesByAge(Integer.parseInt(age));

        Employee e1=new Employee(123);
        e1.takeAttendace(user1,people);
        e1.takePirces(spiderMan,9.99,people);
        e1.reducePrice(user1,people,spiderMan,9.99);










    }
}