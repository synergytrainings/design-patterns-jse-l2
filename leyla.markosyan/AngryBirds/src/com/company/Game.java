package com.company;

import java.util.ArrayList;

/**
 * @author leyla.markosyan on 4/19/2017.
 */
public class Game {
	Integer id;
	String name;
	ArrayList<Killers> killers = new ArrayList<>();

	private Game() {}

	private Game(Integer id, String name){
		this.id = id;
		this.name = name;
	}

	private static class GameHolder {
		private static Game game = new Game(1, "Angry Birds!");
	}

	public static Game getInstance() {
		if(GameHolder.game == null) {
			GameHolder.game = new Game(1, "Angry Birds!");
		}
		return GameHolder.game;
	}

	public void addBird(Killers killer) {
		killers.add(killer);
	}

	public static void start() {
		// Load game
	}

	public static void end() {
		// closes instance and ends game
		GameHolder.game = null;
	}
}
