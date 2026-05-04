package com.mygdx.resources.enums;

public enum SoundEnum {
    MEW;

    public String path;

    SoundEnum(String path){
        this.path = "assets/audio/" + path;
    }

    SoundEnum(){
        this.path = "assets/audio/" + name().toLowerCase() + ".mp3";
    }
}
