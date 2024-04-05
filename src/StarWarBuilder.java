public class StarWarBuilder implements IBuilder {
    Movie movie;
    StarWarBuilder(){
        this.movie=new Movie();
    }

    public void buildName(){
        this.movie.setName("Star War");
    }
    public void buildAge(){
        this.movie.setAge(18);
    }
    public void buildGenre(){
        this.movie.setGenre("Science Fiction");
    }
    public void buildPrice(){
        this.movie.setPrice(10.99);
    }
    public Movie getMovie(){
        return this.movie;
    }
}
