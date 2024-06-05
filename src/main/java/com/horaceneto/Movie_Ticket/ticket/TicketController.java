package com.horaceneto.Movie_Ticket.ticket;

import com.horaceneto.Movie_Ticket.cinema.Screen;
import com.horaceneto.Movie_Ticket.cinema.ScreenService;
import com.horaceneto.Movie_Ticket.movie.Movie;
import com.horaceneto.Movie_Ticket.movie.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/ticket")
public class TicketController {

    @Autowired
    private TicketService ticketService;
    private ScreenService screenService;
    private MovieService movieService;



}
