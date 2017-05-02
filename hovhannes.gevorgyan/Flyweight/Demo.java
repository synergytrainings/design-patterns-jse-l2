/**
 * Created by hovhannes.gevorgyan on 01-May-17.
 */
public class Demo {
    private static BirdFactory birdFactory = new BirdFactory();
    private static Hunter hunter = new Hunter("Rambo");

    private static final String colors[] = {"White", "Gray", "Black"};

    private static String getAnyColor() {
        int index = (int) (Math.random() * colors.length);
        return colors[index];
    }

    private static double getAnySpeed() {
        return 20.0 + Math.random() * 10;
    }

    public static void main(String[] args) {
        int countOfKilledDucks = 0;

        for (int i = 0; i < 10; i++) {
            Duck duck = (Duck) BirdFactory.getDuck(getAnyColor());
            duck.setSpeed(getAnySpeed());

            duck.fly();

            hunter.shoot();
            if(hunter.isShootSuccessful()) {
                duck.die();
                countOfKilledDucks++;
            } else {
                duck.vanish();
            }
        }
        System.out.println("\nCount of killed ducks: " + countOfKilledDucks);

        System.out.println("\nTotal Duck objects made: " + birdFactory.getTotalDucksMade());
    }
}