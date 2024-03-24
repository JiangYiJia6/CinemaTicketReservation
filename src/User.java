public class User implements MovieList{
    private String name;
    private Cinema cinema;



    public User(String name,Cinema cinema){
        this.name=name;
        this.cinema=cinema;
    }

    public void update(Movie movieType){
        System.out.println("Hey " + name + ", the movie " + movieType.getName() + " is about to start.");
    }
    public void rateMovie(Movie movieType, int score) {
        cinema.rateMovie(movieType, score);
        System.out.println("You have rated the movie " + movieType.getName() + ": " + score);
    }

    public void reserveMovie(Cinema cinema){
        this.cinema = cinema;
    }
}
