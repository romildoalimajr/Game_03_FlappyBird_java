package net.kalangos.entities;

import java.awt.image.BufferedImage;

import net.kalangos.main.Game;
import net.kalangos.world.World;

public class Player extends Entity {

	public boolean isPressed = false;

	public Player(int x, int y, int width, int height, double speed, BufferedImage sprite) {
		super(x, y, width, height, speed, sprite);

		
	}

	public void tick() {
		depth = 2;
		if(!isPressed) {
			y += 2;
		}else {
			y -= 2;
		}
		
		if(y > Game.HEIGHT) {
			World.restartGame();
		}
		
		//testar colisão
		
		for(int i = 0; i < Game.entities.size(); i++) {
			Entity e = Game.entities.get(i);
			if(e != this) {
				if(Entity.isColidding(this, e)) {
					//Game over
					World.restartGame();
					return;
				}
			}
		}
	}



}
