package main.java.flyweight.coffee;

import java.util.List;
import java.util.Vector;

/**
 * Created by Vigen.Vardanyan on 4/17/2017.
 */
public class CoffeeShopFlyweightTest {
    private final List<Order> orders = new Vector<>();
    private final Menu menu = new Menu();

    private void takeOrder(String flavourName, int table) {
        CoffeeFlavour flavour = menu.lookup(flavourName);
        Order order = new Order(table, flavour);
        orders.add(order);
    }

    private void service() {
        for (Order order : orders) {
            order.serve();
        }
    }

    private String report() {
        return "\n" + menu.totalCoffeeFlavours();
    }

    public static void main(String[] args) {
        CoffeeShopFlyweightTest shop = new CoffeeShopFlyweightTest();

        shop.takeOrder("Cappuccino", 2);
        shop.takeOrder("Espresso", 1);
        shop.takeOrder("Americano", 4);
        shop.takeOrder("Cappuccino", 7);
        shop.takeOrder("Americano", 8);
        shop.takeOrder("Espresso", 3);
        shop.takeOrder("Cappuccino", 3);
        shop.takeOrder("Americano", 5);
        shop.takeOrder("Espresso", 6);
        shop.takeOrder("Americano", 9);
        shop.takeOrder("Cappuccino", 9);
        shop.takeOrder("Espresso", 9);

        shop.service();
        System.out.println(shop.report());
    }
}
