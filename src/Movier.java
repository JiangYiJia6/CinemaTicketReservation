public class Movier {
    IBuilder iBuilder;

    Movier(IBuilder iBuilder){
        this.iBuilder=iBuilder;
    }
    void createMovie(){
        this.iBuilder.buidName();
        this.iBuilder.buildGenre();
        this.iBuilder.buildAge();

    }
    Movie getMovie(){

        return this.iBuilder.getMovie();
    }
}
