package meruzhan_gasparyan;

import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by meruzhan.gasparyan on 14-Apr-17.
 */
public class SingletonBeanFactory {


    private static SingletonBeanFactory instance;
    private Map<Class<?>, Object> beans = new HashMap<>();

    private SingletonBeanFactory() {

        if (instance != null) {
            throw new RuntimeException("This is class instance Single and  was created");
        }
    }

    public static SingletonBeanFactory getInstance() {
        if (instance == null) {
            synchronized (SingletonBeanFactory.class) {
                if (instance == null) {
                    instance = new SingletonBeanFactory();
                }
            }

        }
        return instance;
    }


    public synchronized <T> T getBeanInstance(Class<T> objectType) throws IllegalAccessException, InstantiationException {

        if (objectType.isInterface() || Modifier.isAbstract(objectType.getModifiers())) {

            for (Map.Entry o : beans.entrySet()) {
                if (objectType.isAssignableFrom(o.getValue().getClass())) {
                    return (T) o.getValue();
                }
            }
        }

        if (this.beans.containsKey(objectType)) {
            return (T) this.beans.get(objectType);
        }
        T obj = objectType.newInstance();

        this.beans.put(objectType, obj);
        return obj;
    }

}
