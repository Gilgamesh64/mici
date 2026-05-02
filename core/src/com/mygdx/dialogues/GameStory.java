package com.mygdx.dialogues;

import com.bladecoder.ink.runtime.Story;
import com.mygdx.entities.helpers.GameActor;
import com.mygdx.entities.helpers.ScriptableActor;
import com.mygdx.resources.enums.ScriptEnum;

public class GameStory {
    private Story story;
    private GameActor currentActor;

    /**
     * Initializes the story, binding the external functions
     * @param inkJsonText
     */
    public GameStory(String inkJsonText) {
        try {
            story = new Story(inkJsonText);
            story.bindExternalFunction("DO", (Object[] args) -> {
                if (currentActor == null)
                    return null;
                if(currentActor instanceof ScriptableActor s){
                    String name = String.valueOf(args[0]);
                    s.doScript(ScriptEnum.valueOf(name));
                }
                
                return null;
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * assigns the story
     * @param actor
     */
    public void setActor(GameActor actor) {
        currentActor = actor;
    }

    public GameActor getCurrentActor() {
        return currentActor;
    }

    public Story getStory() {
        return story;
    }

}
