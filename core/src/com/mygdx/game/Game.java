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

	int speed = 4;
	final int walkSpeed = 4;
	final int runSpeed = walkSpeed * 2;
	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("badlogic.jpg");
	}

	@Override
	public void render () {
		ScreenUtils.clear(1, 0, 0, 1);
		if(Gdx.input.isKeyPressed(Input.Keys.SHIFT_LEFT)) {
			speed = runSpeed;
		} else {
			speed = walkSpeed;
		}
		if (Gdx.input.isKeyPressed(Input.Keys.UP)) {
			y+=speed;
		}
		if (Gdx.input.isKeyPressed(Input.Keys.DOWN)) {
			y-=speed;
		}
		if (Gdx.input.isKeyPressed(Input.Keys.LEFT)) {
			x-=speed;
		}
		if (Gdx.input.isKeyPressed(Input.Keys.RIGHT)) {
			x+=speed;
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
