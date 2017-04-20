package com.company;

import java.awt.*;

/**
 * @author leyla.markosyan on 4/19/2017.
 */
public class AngryBirds extends Bird implements Killers {
	private Color color;

	public AngryBirds(Color color) {
		this.color = color;
	}

	@Override
	public void shoot() {
		// Implement way angry bird shoots
	}

	@Override
	public void addToGame(Killers bird) {
		Game game = Game.getInstance();
		game.addBird(bird);
	}
}
