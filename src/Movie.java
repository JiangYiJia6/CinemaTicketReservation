public enum Movie {
    SPIDER_MAN("SPIDER_MAN", "Action"),
    STAR_WAR("STAR_WAR", "Science Fiction");

    private final String name;
    private final String genre;

    Movie(String name, String genre) {
        this.name = name;
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    public String getGenre() {
        return genre;
    }
}
