package com.mygdx.screens;

import java.util.HashMap;

import com.mygdx.game.Main;
import com.mygdx.resources.RM;
import com.mygdx.screens.generic.GenericScreen;
import com.mygdx.screens.generic.PlayableScreen;
import com.mygdx.screens.menus.MenuScreen;
import com.mygdx.screens.menus.PauseScreen;
import com.mygdx.screens.menus.SettingsScreen;

public class ScreensManager {

    private static final HashMap<Screens, GenericScreen> map = new HashMap<>();
    private static Screens lastPlayableActiveScreen;

    public static GenericScreen getScreen(Screens name) {
        if (map.get(name) == null) {
            switch (name) {
                case MENU_SCREEN -> {
                    map.put(Screens.MENU_SCREEN, new MenuScreen());
                }
                case PAUSE_SCREEN -> {
                    map.put(Screens.PAUSE_SCREEN, new PauseScreen());
                }
                case SETTINGS -> {
                    map.put(Screens.SETTINGS, new SettingsScreen());
                }
                case SLUMS -> {
                    map.put(Screens.SLUMS, new Entrance());
                }
                case PARK -> {
                    map.put(Screens.PARK, new Right());
                }
                case RICH_DISTRICT -> {
                    map.put(Screens.RICH_DISTRICT, new Center());
                }
                case INSIDE -> {
                    map.put(Screens.INSIDE, new Left());
                }
            }
        }
        if (map.get(name) instanceof PlayableScreen)
            lastPlayableActiveScreen = name;
        return map.get(name);
    }

    public static PlayableScreen getPlayableScreen(Screens screenName) {
        return (PlayableScreen) getScreen(screenName);
    }

    public static boolean isNull(Screens screenName) {
        return map.get(screenName) == null;
    }

    public static Screens getLastPlayableActiveScreen() {
        return lastPlayableActiveScreen;
    }

    public static void setScreen(Screens s){
        RM.get().stopAllAudio();
        Main.getInstance().setScreen(ScreensManager.getScreen(s));
    }

    public static void setScreen(Screens s, String doorName){
        RM.get().stopAllAudio();
        Main.getInstance().setScreen(ScreensManager.getScreen(s));
        if(Main.getInstance().getScreen() instanceof PlayableScreen ps){
            ps.exitFrom(doorName);
        }
    }
}
