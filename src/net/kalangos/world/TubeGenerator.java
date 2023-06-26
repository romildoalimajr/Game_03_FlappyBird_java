package net.kalangos.world;

import net.kalangos.entities.Entity;
import net.kalangos.entities.Tube;
import net.kalangos.main.Game;

public class TubeGenerator {

	public int timer = 0;
	public int targetTimer = 60;
	
	public void tick() {
		timer++;
		if(timer == 60) {
			//criar tubo novo e resetar o contador
			int sizeUp = Entity.rand.nextInt(50 - 30) + 30;
			Tube tubeUp = new Tube(Game.WIDTH, 0, 20, sizeUp, 1, null);
			
			int sizeDown = Entity.rand.nextInt(50 - 30) + 30;
			Tube tubeDown = new Tube(Game.WIDTH, Game.HEIGHT - sizeDown, 20, sizeDown, 1, null);
			
			Game.entities.add(tubeUp);
			Game.entities.add(tubeDown);
			timer = 0;
		}
		       
	}
}
