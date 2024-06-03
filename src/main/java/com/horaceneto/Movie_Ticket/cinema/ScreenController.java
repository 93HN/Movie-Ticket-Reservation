package com.horaceneto.Movie_Ticket.cinema;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/screen")
public class ScreenController {

    @Autowired
    private ScreenService screenService;

    @PostMapping("/create")
    public ResponseEntity<Screen> createScreen(@RequestBody Screen screen) {
        Screen newScreen = screenService.createNewScreen(screen);
        return new ResponseEntity<>(newScreen, HttpStatus.CREATED);
    }

}
