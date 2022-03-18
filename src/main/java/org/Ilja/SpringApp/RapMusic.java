package org.Ilja.SpringApp;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RapMusic implements Music {

    private List<String> songs = new ArrayList<>();

    {
        songs.add("Don't Play That");
        songs.add("Nail Tech");
        songs.add("Ghetto Gospel");
    }

    @Override
    public List<String> getSong() {
        return songs;
    }
}
