package com.mygdx.resources.enums;

public enum ScriptEnum {
    TEST("fuck");

    public String path;

    ScriptEnum(String path){
        this.path = "assets/scripts/" + path + ".gcs";
    }
    
}
