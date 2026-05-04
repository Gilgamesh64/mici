package com.mygdx.hud;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputMultiplexer;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.utils.Disposable;
import com.badlogic.gdx.utils.viewport.ExtendViewport;
import com.mygdx.Data;
import com.mygdx.resources.RM;

public class Hud implements Disposable {
    private static Hud instance;

    public static Hud get() {
        return instance;
    }

    public static void set(Hud h) {
        instance = h;
    }

    public static Stage stage() {
        return get().stage;
    }

    private final Stage stage;

    private Table table;
    private Label fps;
    private Label debugData;

    public Hud(InputMultiplexer mux) {
        var viewport = new ExtendViewport(Data.VIEWPORT_X, Data.VIEWPORT_Y, new OrthographicCamera());
        stage = new Stage(viewport);
        mux.addProcessor(0, stage);


        table = new Table();
        table.setFillParent(true);
        table.defaults().expand();
        stage.addActor(table);

        fps = new Label("", RM.get().skin());
        table.add(fps).top().left();

        debugData = new Label("Debug: ", RM.get().skin());
        table.add(debugData).top().right();
    }

    public void draw() {
        stage.draw();
    }

    public void update() {
        stage.act(Gdx.graphics.getDeltaTime());
        
        fps.setText("Current FPS: " + Gdx.graphics.getFramesPerSecond());
    }

    @Override
    public void dispose() {
        stage.dispose();
    }

    public void setDebugSting(String debugSting) {
        debugData.setText(debugSting);
    }

    public void resize(int width, int height) {
        stage.getViewport().update(width, height, false);
    }
}
