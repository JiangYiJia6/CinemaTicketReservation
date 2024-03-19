public class User implements MovieList{
    private String name;
    private int RATE,Loyalty_point;

    //private Movie movie =new Movie();

    public User(String name){
        this.name=name;
       

    }

    public void update(Movie movieType){
        System.out.println("hey "+name+" ,movie is about to start ");
    }

    public void reserveMovie(Cinema cinema){
        cinema = cinema;
    }
}
