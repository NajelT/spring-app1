package org.Ilja.SpringApp.genres;

import org.Ilja.SpringApp.Music;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;


public class ClassicalMusic implements Music {

//    @PostConstruct
//    public void doMyInit(){
//        System.out.println("Doing my initialization");
//    }
//
//    @PreDestroy
//    public void doMyDestroy(){
//        System.out.println("doing my destruction");
//    }

    private List<String> songs = new ArrayList<>();

    {
        songs.add("Hungarian Rhapsody");
        songs.add("O Fortuna");
        songs.add("Night on Bad Mountain");
    }


    @Override
    public String getSong(){
        return "Hungarian Rhapsody";
    }



}
