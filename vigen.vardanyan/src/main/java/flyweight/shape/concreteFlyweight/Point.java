package main.java.flyweight.shape.concreteFlyweight;

import main.java.flyweight.shape.Shape;

/**
 * Created by Vigen.Vardanyan on 4/28/2017.
 */
public class Point implements Shape {
    @Override
    public void draw(int x, int y) {
        System.out.println("(" + x + "," + y + ") : drawing point");
    }
}
