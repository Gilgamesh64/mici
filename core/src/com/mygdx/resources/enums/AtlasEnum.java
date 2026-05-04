package com.mygdx.resources.enums;

public enum AtlasEnum {
    PLAYER,
    NPCS,
    BUILDINGS,
    COMPONENTS,
    EFFECTS;

    public String path;

    AtlasEnum(){
        this.path = "assets/packed/" + name().toLowerCase() + ".atlas";
    }

    AtlasEnum(String path){
        this.path = path;
    }
}
