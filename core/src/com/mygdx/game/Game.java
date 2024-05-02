package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

public class Game extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	float x;
	float y;
	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("badlogic.jpg");
	}

	@Override
	public void render () {
		ScreenUtils.clear(1, 0, 0, 1);
		if (Gdx.input.isKeyPressed(Input.Keys.UP)) {
			y+=4;
		}
		if (Gdx.input.isKeyPressed(Input.Keys.DOWN)) {
			y-=4;
		}
		if (Gdx.input.isKeyPressed(Input.Keys.LEFT)) {
			x-=4;
		}
		if (Gdx.input.isKeyPressed(Input.Keys.RIGHT)) {
			x+=4;
		}

		batch.begin();
		batch.draw(img, x, y);
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
}
