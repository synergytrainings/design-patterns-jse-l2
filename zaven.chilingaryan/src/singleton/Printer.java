package singleton;

import java.util.List;

/**
 * Created by Zaven on 17.04.2017.
 */
public class Printer {
    private static Printer instance;


    private Printer() {
        if (instance != null)
            throw new RuntimeException("This instance is Singleton");
    }


    public static Printer getInstance() {
        if (instance == null) {
            synchronized (Printer.class) {
                if (instance == null) {
                    instance = new Printer();
                }
            }
        }
        return instance;
    }


    public synchronized void print(int i, String name) {
        System.out.println(name + " " + i);
    }

    public synchronized void printList(List<Integer> list, String tradeName) {
        System.out.println(tradeName + " " + list.toString());

    }
}
