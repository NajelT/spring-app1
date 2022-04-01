package org.Ilja.SpringApp.genres;

import org.Ilja.SpringApp.Music;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


public class RapMusic implements Music {

    private List<String> songs = new ArrayList<>();

    {
        songs.add("Don't Play That");
        songs.add("Nail Tech");
        songs.add("Ghetto Gospel");
    }

    @Override
    public String getSong() {
        return "Don't Play That";
    }
}
