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

        Cinema movieRecommendation = new Cinema();

        Map<String, Movie> recommendedMoviesGenre = movieRecommendation.recommendMoviesByGenre("Action");
        assertEquals(1, recommendedMoviesGenre.size());
        assertTrue(recommendedMoviesGenre.containsKey("Spider Man"));

        recommendedMoviesGenre = movieRecommendation.recommendMoviesByGenre("Science Fiction");
        assertEquals(1, recommendedMoviesGenre.size());
        assertTrue(recommendedMoviesGenre.containsKey("Star War"));


        recommendedMoviesGenre = movieRecommendation.recommendMoviesByGenre("Unknown Genre");
        assertTrue(recommendedMoviesGenre.isEmpty());
    }

    @Test
    public void testRecommendMoviesByAge() {

        Cinema movieRecommendation = new Cinema();


        Map<String, Movie> recommendedMoviesAge = movieRecommendation.recommendMoviesByAge(12);
        assertEquals(1, recommendedMoviesAge.size());
        assertTrue(recommendedMoviesAge.containsKey("Spider Man"));


        recommendedMoviesAge = movieRecommendation.recommendMoviesByAge(18);
        assertEquals(2, recommendedMoviesAge.size());
        assertTrue(recommendedMoviesAge.containsKey("Spider Man"));
        assertTrue(recommendedMoviesAge.containsKey("Star War"));


        
    }
}