package singleton;

import java.lang.reflect.Constructor;

/**
 * Created by Vigen.Vardanyan on 4/17/2017.
 */
public class SingletonTest {

    public static void main(String[] args) {
        LazySingleton instanceOne = LazySingleton.getInstance();
        LazySingleton instanceTwo = null;
        try {
            Constructor[] constructors = LazySingleton.class.getDeclaredConstructors();
            for (Constructor constructor : constructors) {
                constructor.setAccessible(true);
                instanceTwo = (LazySingleton) constructor.newInstance();
                break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(instanceOne.hashCode());
        if (instanceTwo != null) {
            System.out.println(instanceTwo.hashCode());
        }
        System.out.println(instanceOne.equals(instanceTwo));
    }
}
