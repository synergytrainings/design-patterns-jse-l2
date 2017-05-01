package main.java.flyweight.shape.concreteFlyweight;

import main.java.flyweight.shape.Shape;

/**
 * Created by Vigen.Vardanyan on 4/28/2017.
 */
public class Circle implements Shape {
    int r = 5;
    static int instanceCount = 0;

    public Circle() {
        instanceCount++;
    }

    @Override
    public void draw(int x, int y) {
        System.out.println("(" + x + "," + y + ") : draw circle with a radius " + r);
        System.out.println("Circle class instance created : " + instanceCount);
    }

    public int getInstanceCount() {
        return instanceCount;
    }
}
