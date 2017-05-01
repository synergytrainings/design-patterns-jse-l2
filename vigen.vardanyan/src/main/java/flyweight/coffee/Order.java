package main.java.flyweight.coffee;

import main.java.flyweight.coffee.CoffeeFlavour;

/**
 * Created by Vigen.Vardanyan on 4/17/2017.
 */
public class Order {
    private final int tableNumber;
    private final CoffeeFlavour flavour;

    Order(int tableNumber, CoffeeFlavour flavor) {
        this.tableNumber = tableNumber;
        this.flavour = flavor;
    }

    void serve() {
        System.out.println("Serving " + flavour + " to table " + tableNumber);
    }
}
