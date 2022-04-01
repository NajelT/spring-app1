package org.Ilja.SpringApp.genres;

import org.Ilja.SpringApp.Music;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;



public class RockMusic implements Music {

    private List<String> songs = new ArrayList<>();

    {
        songs.add("Rock and Roll");
        songs.add("Barracuda");
        songs.add("Purple Haze");
    }

    @Override
    public String getSong() {
        return "Rock and Roll";
    }
}
