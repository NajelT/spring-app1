package org.Ilja.SpringApp;

import org.Ilja.SpringApp.config.SpringConfig;
import org.Ilja.SpringApp.genres.JazzMusic;
import org.Ilja.SpringApp.genres.MusicGenre;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        System.out.println(musicPlayer.playMusic());

        Computer computer = context.getBean("computer", Computer.class);


        context.close();
    }
}
