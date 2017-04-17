/**
 * Created by hovhannes.gevorgyan on 4/12/2017.
 * Example for Singleton Design Pattern
 */
class Moon {
    private static Moon instance;

    /**
     * constructor
     */
    private Moon() {};

    /**
     * init Moon object
     * instant initializing only once, during first access
     * @return same object for all calls
     */
    static Moon getInstance() {
        if(instance == null) {
            instance = new Moon();
        }
        return instance;
    }

    /**
     * print distance between Earth and Moon
     */
    void getDistanceBetweenEarthAndMon() {
        System.out.println("Distance between Earth and Moon is 384,400 km");
    }

    /**
     * print Moon age
     */
    void getMoonAge() {
        System.out.println("Moon age: 4.53 billion years");
    }
}
