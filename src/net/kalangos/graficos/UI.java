package net.kalangos.graficos;


import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import net.kalangos.main.Game;

public class UI {

	public void render(Graphics g) {
		g.setColor(Color.WHITE);
		g.setFont(new Font("arial", Font.BOLD, 18));
		g.drawString("Score.: " + (int)Game.score, 20, 20);
	
	}
	
}
