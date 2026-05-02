package com.mygdx.game;

import com.badlogic.gdx.Game;
import com.mygdx.Logger;
import com.mygdx.resources.RM;
import com.mygdx.resources.ResourceManager;
import com.mygdx.screens.Screens;
import com.mygdx.screens.ScreensManager;

public class Main extends Game {

	private static Main instance;
	private ResourceManager manager;

	public Main(){
		instance = this;
	}

	public static Main getInstance() {
		return instance;
	}

	public ResourceManager getManager() {
		return manager;
	}

	@Override
	public void create() {
		manager = new ResourceManager();

		Logger.init();
		
		setScreen(ScreensManager.getScreen(Screens.MENU_SCREEN));
	}

	@Override
	public void render() {
		super.render();
	}

	@Override
	public void dispose() {
		RM.get().dispose();
	}
}
