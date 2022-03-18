package org.Ilja.SpringApp;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicalMusic implements Music{

    private List<String> songs = new ArrayList<>();

    {
        songs.add("Hungarian Rhapsody");
        songs.add("O Fortuna");
        songs.add("Night on Bad Mountain");
    }


    @Override
    public List<String> getSong(){
        return songs;
    }



}
