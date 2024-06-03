package com.horaceneto.Movie_Ticket.cinema;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ScreenServiceimp implements ScreenService {

    @Autowired
    private ScreenRepository screenRepository;

    public Screen createNewScreen(Screen screen) {
        Screen newScreen = screenRepository.save(screen);
        newScreen.setCapacity(30);
        return newScreen;
    }

}
