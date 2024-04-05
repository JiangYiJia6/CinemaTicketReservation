public class SpiderManBuilder {
    Movie movie;
    SpiderManBuilder(){
        this.movie=new Movie();
    }

    public void buildName(){
        this.movie.setName("Spider Man");
    }
    public void buildAge(){
        this.movie.setAge(12);
    }
    public void buildGenre(){
        this.movie.setGenre("Action");
    }
    public Movie getMovie(){
        return this.movie;
    }
}
