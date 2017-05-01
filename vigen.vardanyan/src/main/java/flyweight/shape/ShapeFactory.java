package main.java.flyweight.shape;

import main.java.flyweight.shape.concreteFlyweight.Circle;
import main.java.flyweight.shape.concreteFlyweight.Point;
import main.java.flyweight.shape.concreteFlyweight.Square;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Vigen.Vardanyan on 4/28/2017.
 */
public class ShapeFactory {
    private static final Map<String, Shape> shapes = new HashMap<>();

    public Shape getShape(String shapeName) {
        Shape shape = shapes.get(shapeName);
        if (shape == null) {
            switch (shapeName) {
                case "circle":
                    shape = new Circle();
                    break;
                case "square":
                    shape = new Square();
                    break;
                case "point":
                    shape = new Point();
                    break;
            }
            shapes.put(shapeName, shape);
        }
        return shape;
    }
}
