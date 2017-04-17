import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by Sipan on 4/16/2017.
 */
public class Main {
    public static void main(String[] args) throws NoSuchMethodException {
        ContactDao instance = ContactDao.getInstance();

        Contact contactOne = new Contact("A","A","A");
        Contact contactTwo = new Contact("B","B","B");

        instance.add(contactOne);
        instance.add(contactTwo);

        Constructor constructor = ContactDao.class.getDeclaredConstructor();
        constructor.setAccessible(true);

        ContactDao instanceTwo = null;
        try {
            instanceTwo = (ContactDao) constructor.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        System.out.println("instance: hashcode = " + instance.hashCode());
        System.out.println("instanceTwo: hashcode = " + instanceTwo.hashCode());

    }
}
