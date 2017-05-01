package main.java.flyweight.shape.concreteFlyweight;

import main.java.flyweight.shape.Shape;

/**
 * Created by Vigen.Vardanyan on 4/28/2017.
 */
public class Square implements Shape {

    private int a = 10;

    @Override
    public void draw(int x, int y) {
        System.out.println("(" + x + "," + y + ") : draw a square with a side " + a);
    }
}
