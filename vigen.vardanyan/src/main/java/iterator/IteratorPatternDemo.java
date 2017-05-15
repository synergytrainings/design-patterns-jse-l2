package main.java.iterator;

import main.java.iterator.list.LinkedList;
import main.java.iterator.list.List;

/**
 * Created by Vigen.Vardanyan on 5/15/2017.
 */
public class IteratorPatternDemo {

    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);

        for(Iterator iterator = list.getIterator(); iterator.hasNext();){
            Integer id = (Integer)iterator.next();
            System.out.println("ID : " + id);
        }

        Iterator<Integer> iterator = list.getIterator();
        while (iterator.hasPrev()) {
            if (iterator.prev().equals(1)) {
                System.out.println("Remove item: " + iterator.get());
                System.out.println("Previous item: " + iterator.prev());
                iterator.remove();
            }
        }
    }
}
