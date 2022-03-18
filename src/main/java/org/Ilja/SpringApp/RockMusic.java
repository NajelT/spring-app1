package org.Ilja.SpringApp;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component
public class RockMusic implements Music {

    private List<String> songs = new ArrayList<>();

    {
        songs.add("Rock and Roll");
        songs.add("Barracuda");
        songs.add("Purple Haze");
    }

    @Override
    public List<String> getSong() {
        return songs;
    }
}
