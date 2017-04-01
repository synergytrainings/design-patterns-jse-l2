import java.awt.*;

/**
 * Flyweight square class to create squares with equal sides.
 *
 * Created by tamara.aprikyan on 4/20/2017.
 */
public class Square {
    private int width = 150;

    private int height = 150;

    private int startPointX;

    private int startPointY;

    private Color color;

    public Square() {
    }

    public Square(int startPointX, int startPointY, Color color) {
        this.startPointX = startPointX;
        this.startPointY = startPointY;
        this.color = color;
    }

    public int getStartPointX() {
        return startPointX;
    }

    public void setStartPointX(int startPointX) {
        this.startPointX = startPointX;
    }

    public int getStartPointY() {
        return startPointY;
    }

    public void setStartPointY(int startPointY) {
        this.startPointY = startPointY;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public boolean haveTheSameProperties(int startPointX, int startPointY, Color color) {
        return (this.startPointX == startPointX && this.startPointY == startPointY && this.color.equals(color));
    }
}
