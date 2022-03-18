package org.Ilja.SpringApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class MusicPlayer {
    private Music rockMusic;
    private Music classicalMusic;
    private Music rapMusic;

    @Autowired
    public MusicPlayer(@Qualifier("rockMusic") Music rockMusic,
                       @Qualifier("classicalMusic") Music classicalMusic,
                       @Qualifier("rapMusic") Music rapMusic) {
        this.rockMusic = rockMusic;
        this.classicalMusic = classicalMusic;
        this.rapMusic = rapMusic;
    }


    public void playMusic(MusicGenre genre) {
        Random random = new Random();
        int randomNum = random.nextInt(3);

        if(genre == MusicGenre.RAP){
            System.out.println(rapMusic.getSong().get(randomNum));
        } else if (genre == MusicGenre.ROCK) {
            System.out.println(rockMusic.getSong().get(randomNum));
        } else {
            System.out.println(classicalMusic.getSong().get(randomNum));
        }

    }
}

