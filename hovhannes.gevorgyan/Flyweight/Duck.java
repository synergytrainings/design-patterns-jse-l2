/**
 * Created by hovhannes.gevorgyan on 01-May-17.
 */
public class Duck implements Bird {
    private String color;
    private double speed;

    public Duck(String color) {
        this.color = color;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getSpeed() {
        return this.speed;
    }

    @Override
    public void fly() {
        System.out.println(color + " Duck is flying with speed " + speed);
    }
}
