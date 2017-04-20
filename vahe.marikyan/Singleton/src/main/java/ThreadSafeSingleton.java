/**
 * Created by VaheMarikyan on 4/13/17.
 */
public class ThreadSafeSingleton {

    private static ThreadSafeSingleton instance;
    private static Integer instanceCount = 0;

    private ThreadSafeSingleton() {
        instanceCount++;
    }

    public static ThreadSafeSingleton getInstance() {
        if (instance == null) {
            synchronized (ThreadSafeSingleton.class) {
                if (instance == null) {
                    instance = new ThreadSafeSingleton();
                }
            }
        }

        return instance;
    }

    public static Integer getInstanceCount() {
        return instanceCount;
    }
}
