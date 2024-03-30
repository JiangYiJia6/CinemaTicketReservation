public class Movie {
    private String name;
    private String genre;
    private int age;

    public Movie(String name, String genre,int age) {
        this.name = name;
        this.genre = genre;
        this.age=age;
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
}
