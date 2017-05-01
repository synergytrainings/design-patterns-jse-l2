package main.java.singleton;

/**
 * Created by Vigen.Vardanyan on 4/13/2017.
 */
public class InertSingleton {

    private static class SingletonHelper {
        private static final InertSingleton instance = new InertSingleton();
    }

    public static InertSingleton getInstance() {
        return SingletonHelper.instance;
    }
}
