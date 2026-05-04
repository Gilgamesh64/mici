package com.mygdx.screens.game;

import com.mygdx.GCStage;
import com.mygdx.entities.npcs.NPCBuilder;
import com.mygdx.resources.enums.AnimationEnum;
import com.mygdx.resources.enums.MapEnum;
import com.mygdx.screens.generic.PlayableScreen;

public class Entrance extends PlayableScreen {

    public Entrance() {
        super(MapEnum.ENTRANCE);
        GCStage.get().addActor(
            NPCBuilder.create(AnimationEnum.TEST_CAT, 48, 48).build()
        );
    }

    @Override
    public void show() {
        super.show();
    }

    @Override
    public void render(float delta) {
        super.render(delta);
    }
}
