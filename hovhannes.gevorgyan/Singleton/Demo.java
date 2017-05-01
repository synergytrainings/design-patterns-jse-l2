/**
 * Created by hovhannes.gevorgyan on 4/12/2017.
 * class for test Singleton
 */
public class Demo {
    public static void main(String[] args) {
        Moon moon = Moon.getInstance();

        moon.getDistanceBetweenEarthAndMon();

        moon.getMoonAge();

        //  Moon moon2 = new Moon();

        //  compiler doesn't allow to create second instance
    }
}