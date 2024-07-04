package com.music.wind;
import com.music.Playable;

public class Saxophone implements Playable {
    @Override
    public void play() {
        System.out.println("Playing the Saxophone.");
    }
}
