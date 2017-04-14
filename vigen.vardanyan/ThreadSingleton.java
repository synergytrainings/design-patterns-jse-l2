package vigen.vardanyan;

/**
 * Created by Vigen.Vardanyan on 13/4/2017.
 */
public class ThreadSingleton {

    private static ThreadSingleton instance;

    public static synchronized ThreadSingleton getInstance() {
        if (instance == null) {
            instance = new ThreadSingleton();
        }
        return instance;
    }

}
