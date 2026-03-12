package com.project.movie;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.project.movie.entity.Movie;
import com.project.movie.service.impl.MovieServiceImpl;

@SpringBootTest
public class MovieServiceTest {

    @Autowired
    private MovieServiceImpl movieService;

    @Test
    void testAddMovies() {

        Movie m1 = new Movie();
        m1.setTitle("Inception");
        m1.setGenre("Sci-Fi");

        Movie m2 = new Movie();
        m2.setTitle("Interstellar");
        m2.setGenre("Sci-Fi");

        List<Movie> movies = List.of(m1, m2);

        movieService.addMovies(m1);

        System.out.println("Movies inserted successfully");
    }
}