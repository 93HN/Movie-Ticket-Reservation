package com.horaceneto.Movie_Ticket.ticket;
import com.horaceneto.Movie_Ticket.cinema.Screen;
import com.horaceneto.Movie_Ticket.movie.Movie;
import jakarta.persistence.*;

@Entity
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "movie_name", referencedColumnName = "id")
    private Movie movie;

    @ManyToOne
    @JoinColumn(name = "screen_name")
    private Screen screen;
}