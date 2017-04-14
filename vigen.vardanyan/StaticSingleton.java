package vigen.vardanyan;

/**
 * Created by Vigen.Vardanyan on 13/4/2017.
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
