package com.company;

import java.awt.*;

public class Main {

	public static void main(String[] args) {
		// couldn't call constructor because Game class is singleton
		// Game game  = new Game();

		Game game1 = Game.getInstance();
		Game game2 = Game.getInstance();

		System.out.println(game1.equals(game2));
		System.out.println(game1.hashCode() == game2.hashCode());

		Color color1 = new Color(100,0,0);
		Color color2 = new Color(0,100,0);

		Killers[] animals = {
				AngryBirdsFactory.createBird(color1),
				AngryBirdsFactory.createBird(color2),
				AngryBirdsFactory.createBird(color1),
				AngryBirdsFactory.createBird(color1),
				AngryBirdsFactory.createBird(color1),
				AngryBirdsFactory.createBird(color2)
		};

		for (Killers bird: animals) {
			game1.addBird(bird);
		}

		game1.start();

		// Game process

		System.out.println(animals.length); // There are 6 birds now in the game
		System.out.println(AngryBirdsFactory.getSizeOfBirds()); // we saved two types of birds

		game1.end();
	}
}
