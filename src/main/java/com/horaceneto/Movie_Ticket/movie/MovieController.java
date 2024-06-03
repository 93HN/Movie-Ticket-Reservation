package com.horaceneto.Movie_Ticket.movie;
import com.horaceneto.Movie_Ticket.cinema.Screen;
import com.horaceneto.Movie_Ticket.cinema.ScreenRepository;
import com.horaceneto.Movie_Ticket.cinema.ScreenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/api/movie")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @PostMapping("/create")
    public ResponseEntity<Movie> createMovie(@RequestBody Movie movie) {
        Movie newMovie = movieService.createMovie(movie);
        return new ResponseEntity<>(newMovie, HttpStatus.CREATED);
    }


}
