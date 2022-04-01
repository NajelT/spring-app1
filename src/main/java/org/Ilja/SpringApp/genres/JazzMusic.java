package org.Ilja.SpringApp.genres;

import org.Ilja.SpringApp.Music;

import java.util.ArrayList;
import java.util.List;

public class JazzMusic implements Music {
    private List<String> songs = new ArrayList<>();

    {
        songs.add("My Funny Valentine");
        songs.add("Somewhere Over The Rainbow");
        songs.add("Summertime");
    }

    @Override
    public String getSong() {
        return "My Funny Valentine";
    }
}
