package singleton;

/**
 * Created by Vigen.Vardanyan on 4/13/2017.
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
