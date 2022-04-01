package org.Ilja.SpringApp.config;

import org.Ilja.SpringApp.*;
import org.Ilja.SpringApp.genres.ClassicalMusic;
import org.Ilja.SpringApp.genres.JazzMusic;
import org.Ilja.SpringApp.genres.RapMusic;
import org.Ilja.SpringApp.genres.RockMusic;
import org.springframework.context.annotation.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Configuration
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {


    @Bean
    @Scope("prototype")
    public ClassicalMusic classicalMusic(){
        return new ClassicalMusic();
    }

    @Bean
    public RockMusic rockMusic(){
        return new RockMusic();
    }

    @Bean
    public RapMusic rapMusic(){
        return new RapMusic();
    }

    @Bean
    public JazzMusic jazzMusic(){
        return new JazzMusic();
    }

    @Bean
    public List <Music> musicList(){
        return Arrays.asList(classicalMusic(), rockMusic(), jazzMusic(), classicalMusic());
    }

    @Bean
    public MusicPlayer musicPlayer(){
        return new MusicPlayer(musicList());
    }

    @Bean
    public Computer computer(){
        return new Computer(musicPlayer());
    }


}