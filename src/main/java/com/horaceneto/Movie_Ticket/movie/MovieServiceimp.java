package com.horaceneto.Movie_Ticket.movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieServiceimp implements MovieService {

    @Autowired
    private MovieRepository movieRepository;

    /* Create new movie */
    public Movie addMovie(Movie movie) {
        Movie newMovie = movieRepository.save(movie);
        return newMovie;
    }



}
