package main.java.singleton;

/**
 * Created by Vigen.Vardanyan on 4/13/2017.
 */
public class ConstantSingleton {

    private static final ConstantSingleton instance = new ConstantSingleton();

    public static ConstantSingleton getInstance() {
        return instance;
    }

}
