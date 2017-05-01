/**
 * Created by hovhannes.gevorgyan on 01-May-17.
 */
import java.util.HashMap;

class BirdFactory {
    private static final HashMap<String, Duck> createdDucks = new HashMap<String, Duck>();

    public static Bird getDuck(String color) {
        Duck duck = (Duck) createdDucks.get(color);

        if (duck == null) {
            duck = new Duck(color);
            createdDucks.put(color, duck);
        }
        return duck;
    }

    public int getTotalDucksMade() {
        return createdDucks.size();
    }
}
