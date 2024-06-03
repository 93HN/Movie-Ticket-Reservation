package com.horaceneto.Movie_Ticket.movie;
import com.horaceneto.Movie_Ticket.cinema.Screen;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "movies")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String title;

    private String sinopse;

   /* @OneToOne
    @JoinColumn(name = "screen_id", referencedColumnName = "id")*/
    private int screen;

}
