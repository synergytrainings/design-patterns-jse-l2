package com.company;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

/**
 * @author leyla.markosyan on 4/19/2017.
 */
public class AngryBirdsFactory {
	private static Map<Color, AngryBirds> birds = new HashMap<>();

	public static synchronized AngryBirds createBird(Color color) {
		if(birds.get(color) == null) {
			birds.put(color, new AngryBirds(color));
		}
		return birds.get(color);
	}

	public static Integer getSizeOfBirds() {
		return birds.size();
	}
}
