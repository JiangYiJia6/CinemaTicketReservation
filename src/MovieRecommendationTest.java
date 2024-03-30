import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;


import java.util.Date;
import java.util.Map;



public class MovieRecommendationTest {

    @Test
    public void testRecommendMoviesByGenre()  {
        // Create some sample movies
        Movie movie1 = new Movie("Spider Man", "Action", 12);
        Movie movie2 = new Movie("Star War", "Science Fiction", 18);
        // Create an instance of the class containing recommendMoviesByGenre method
        Cinema movieRecommendation = new Cinema();

        // Test when there are movies of the specified genre
        Map<String, Movie> recommendedMoviesGenre = movieRecommendation.recommendMoviesByGenre("Action");
        assertEquals(1, recommendedMoviesGenre.size());
        assertTrue(recommendedMoviesGenre.containsKey("Spider Man"));

        recommendedMoviesGenre = movieRecommendation.recommendMoviesByGenre("Science Fiction");
        assertEquals(1, recommendedMoviesGenre.size());
        assertTrue(recommendedMoviesGenre.containsKey("Star War"));

        // Test when there are no movies of the specified genre
        recommendedMoviesGenre = movieRecommendation.recommendMoviesByGenre("Unknown Genre");
        assertTrue(recommendedMoviesGenre.isEmpty());
    }

    @Test
    public void testRecommendMoviesByAge() throws ErrorAge {
        // Create some sample movies
        Movie movie1 = new Movie("Spider Man", "Action", 12);
        Movie movie2 = new Movie("Star War", "Science Fiction", 18);
        // Create an instance of the class containing recommendMoviesByGenre method
        Cinema movieRecommendation = new Cinema();

        // Test when age is less than or equal to 18
        Map<String, Movie> recommendedMoviesAge = movieRecommendation.recommendMoviesByAge(12);
        assertEquals(1, recommendedMoviesAge.size());
        assertTrue(recommendedMoviesAge.containsKey("Spider Man"));

        // Test when age is greater than 18
        recommendedMoviesAge = movieRecommendation.recommendMoviesByAge(18);
        assertEquals(1, recommendedMoviesAge.size());
        assertTrue(recommendedMoviesAge.containsKey("Star War"));

        // Test when age is greater than 18
        recommendedMoviesAge = movieRecommendation.recommendMoviesByAge(25);
        assertTrue(recommendedMoviesAge.isEmpty());
    }
}