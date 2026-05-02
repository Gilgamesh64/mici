package com.mygdx.resources.enums;

public enum MapEnum {
    LEFT,
    RIGHT,
    CENTER,
    ENTRANCE;

    public String path;
    MapEnum(){
        this.path = "assets/maps/" + name().toLowerCase() + ".tmx";
    }
}
