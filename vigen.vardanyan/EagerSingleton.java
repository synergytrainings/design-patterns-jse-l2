package vigen.vardanyan;

/**
 * Created by Vigen.Vardanyan on 13/4/2017.
 */
public class EagerSingleton {

    private static final EagerSingleton instance = new EagerSingleton();

    public static EagerSingleton getInstance() {
        return instance;
    }

}
