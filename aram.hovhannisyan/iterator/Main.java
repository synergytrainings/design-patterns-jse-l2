import java.util.TreeSet;

/**
 * Created by aramc on 5/18/2017.
 */
public class Main {
    public static void main(String[] args) {
        List t = new List();

        t.add(5);
        t.add(8);
        t.add(3);
        t.add(67);
        t.add(80);
        t.add(1);
        t.add(4);

//        t.print();

        List.ListIterator iterator = t.getIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
