package org.Ilja.SpringApp;

import org.Ilja.SpringApp.genres.MusicGenre;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class MusicPlayer {

    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;

//    private Music rockMusic;
//    private Music classicalMusic;
//    private Music rapMusic;
//    private Music jazzMusic;

    private List<Music> musicList;


    public MusicPlayer(List<Music> musicList){
        this.musicList = musicList;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public String playMusic() {
        Random random = new Random();

        return "Playing: " + musicList.get(random.nextInt(musicList.size())).getSong()
                + " with volume " + this.volume;
    }
}

