package main.java.singleton;

/**
 * Created by Vigen.Vardanyan on 4/13/2017.
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
