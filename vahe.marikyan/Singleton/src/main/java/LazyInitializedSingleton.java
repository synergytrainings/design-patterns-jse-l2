/**
 * Created by VaheMarikyan on 4/12/17.
 */
public class LazyInitializedSingleton {

    private LazyInitializedSingleton() {
    }

    public static LazyInitializedSingleton getInstance() {
        return SingleInstanceHolder.instance;
    }

    private static class SingleInstanceHolder {
        private static final LazyInitializedSingleton instance = new LazyInitializedSingleton();
    }
}
