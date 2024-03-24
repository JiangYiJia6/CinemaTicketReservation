// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Cinema cinema = new Cinema();
        cinema.upload("spider man", "7:00 PM", 1);
        User user1 = new User("Tom",cinema);
        User user2 = new User("Alex",cinema);

        cinema.getNotificationService().reserve(user1, Movie.SPIDER_MAN);
        cinema.getNotificationService().reserve(user2, Movie.SPIDER_MAN);

        cinema.getNotificationService().unreserve(user2,Movie.SPIDER_MAN);
        Seat seat=new Seat(10,20);
        seat.bookSeat(2,2);
        seat.displaySeats();
        cinema.Notify(Movie.SPIDER_MAN);

        user1.rateMovie(Movie.SPIDER_MAN,5);









    }
}