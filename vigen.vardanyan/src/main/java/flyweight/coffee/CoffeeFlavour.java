package main.java.flyweight.coffee;

/**
 * Created by Vigen.Vardanyan on 4/17/2017.
 */
public class CoffeeFlavour {
    private final String name;

    CoffeeFlavour(String newFlavor) {
        this.name = newFlavor;
    }

    @Override
    public String toString() {
        return name;
    }
}
