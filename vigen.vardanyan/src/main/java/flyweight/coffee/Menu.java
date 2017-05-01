package main.java.flyweight.coffee;

import main.java.flyweight.coffee.CoffeeFlavour;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by Vigen.Vardanyan on 4/17/2017.
 */
public class Menu {
    private Map<String, CoffeeFlavour> flavours = new ConcurrentHashMap<>();

    CoffeeFlavour lookup(String flavorName) {
        if (!flavours.containsKey(flavorName)) {
            flavours.put(flavorName, new CoffeeFlavour(flavorName));
        }
        return flavours.get(flavorName);
    }

    int totalCoffeeFlavours() {
        return flavours.size();
    }
}
