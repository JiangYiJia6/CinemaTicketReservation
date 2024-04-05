public class Movie {
    private String name;
    private String genre;
    private int age;


    public Movie() {

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void display(){
        System.out.println("Name is " + this.name);
        System.out.println("Age is " + this.age);
        System.out.println("Genre is " + this.genre);
    }
}