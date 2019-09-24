package com.example.aruna.resource;

import com.example.aruna.model.Movie;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movies")
public class MovieResource {

    @RequestMapping("/{movieId}")
    public Movie getMovieDetails (@PathVariable int movieId) {
        Movie movie = new Movie(123, "Wijayaba Kollaya", "Historical Story");
        return movie;
    }
}
