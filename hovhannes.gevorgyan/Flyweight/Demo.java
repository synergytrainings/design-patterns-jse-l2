/**
 * Created by hovhannes.gevorgyan on 01-May-17.
 */
public class Demo {
    private static BirdFactory birdFactory = new BirdFactory();

    private static final String colors[] = {"White", "Gray", "Black"};

    private static String getAnyColor() {
        int index = (int) (Math.random() * colors.length);
        return colors[index];
    }

    private static double getAnySpeed() {
        return 20.0 + Math.random() * 10;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Duck duck = (Duck) BirdFactory.getDuck(getAnyColor());
            duck.setSpeed(getAnySpeed());

            duck.fly();
        }

        System.out.println("\nTotal Duck objects made: " + birdFactory.getTotalDucksMade());
    }
}