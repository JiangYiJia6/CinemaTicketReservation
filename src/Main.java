// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {




                Cinema cinema = new Cinema();


                User user1 = new User("Yijia",cinema);
                User user2 = new User("Jiang",cinema);


                cinema.getNotificationService().reserve(user1, Movie.SPIDER_MAN);
                cinema.getNotificationService().reserve(user2, Movie.STAR_WAR);


                cinema.upload("spider man", "7:00 PM", 1);


                cinema.Notify(Movie.SPIDER_MAN);
                user1.rateMovie(Movie.SPIDER_MAN,5);

                







    }
}