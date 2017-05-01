package main.java.singleton;

/**
 * Created by Vigen.Vardanyan on 4/13/2017.
 */
public class StaticSingleton {

    private static StaticSingleton instance;

    static {
        instance = new StaticSingleton();
    }

    public static StaticSingleton getInstance() {
        return instance;
    }
}
