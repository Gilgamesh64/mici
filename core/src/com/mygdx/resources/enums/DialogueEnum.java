package com.mygdx.resources.enums;

public enum DialogueEnum {
    TEST;

    public String path;

    DialogueEnum(){
        this.path = name().toLowerCase() + ".json";
    }
}
