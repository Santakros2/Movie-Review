package com.project.movie.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.movie.entity.Movie;
import com.project.movie.repository.MovieRepository;

@Service
public class MovieServiceImpl {

    private final MovieRepository movieRepository;

    public MovieServiceImpl(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }
    
    public void addMovies(Movie movie) {
    	movieRepository.save(movie);
    }
    
}

