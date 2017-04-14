package vigen.vardanyan;

/**
 * Created by Vigen.Vardanyan on 13/4/2017.
 */
public class BillPughSingleton {

    private static class SingletonHelper {
        private static final BillPughSingleton instance = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance() {
        return SingletonHelper.instance;
    }
}
