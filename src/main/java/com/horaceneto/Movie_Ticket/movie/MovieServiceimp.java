package com.horaceneto.Movie_Ticket.movie;
import com.horaceneto.Movie_Ticket.cinema.ScreenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieServiceimp implements MovieService {

    @Autowired
    private MovieRepository movieRepository;

    @Autowired
    private ScreenRepository screenRepository;

    /* Create new movie */
    public Movie createMovie(Movie movie) {
        return movieRepository.save(movie);

    }
}
