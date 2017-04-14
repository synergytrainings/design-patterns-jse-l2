package vigen.vardanyan;

/**
 * Created by Vigen.Vardanyan on 13/4/2017.
 */
public class LazySingleton {

    private static LazySingleton instance;

    public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
