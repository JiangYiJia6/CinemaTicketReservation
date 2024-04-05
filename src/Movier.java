public class Movier {
    IBuilder iBuilder;

    Movier(IBuilder iBuilder){
        this.iBuilder=iBuilder;
    }
    void createMovie(){
        this.iBuilder.buildName();
        this.iBuilder.buildGenre();
        this.iBuilder.buildAge();
        this.iBuilder.buildPrice();

    }
    Movie getMovie(){

        return this.iBuilder.getMovie();
    }
}
