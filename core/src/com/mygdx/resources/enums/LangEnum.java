package com.mygdx.resources.enums;

import com.mygdx.resources.RM;

public enum LangEnum {
    ITA,
    ENG;

    public String label;

    LangEnum() {
        this.label = "assets/dialogues/entities" + name().toLowerCase();
    }

    private static LangEnum current = LangEnum.ITA;

    public static LangEnum getCurrent() {
        return current;
    }

    public static void setCurrent(LangEnum lang) {
        current = lang;
        RM.get().updateLang();
    }
}
