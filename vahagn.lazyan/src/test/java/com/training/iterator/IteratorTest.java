package com.training.iterator;

import com.training.iterator.impl.Menu;
import com.training.iterator.impl.Order;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author vahag
 * @since 14.05.17
 */
@RunWith(SpringJUnit4ClassRunner.class)
public class IteratorTest {

    @Test
    public void test1(){
        Menu menu = Menu.getInstance();
        menu.addItemToOrderList(new Order("drink 1", Order.OrderType.DRINK,1));
        menu.addItemToOrderList(new Order("other 1", Order.OrderType.OTHER,2));
        menu.addItemToOrderList(new Order("drink 2", Order.OrderType.DRINK,1));
        menu.addItemToOrderList(new Order("drink 3", Order.OrderType.DRINK,1));
        menu.addItemToOrderList(new Order("drink 4", Order.OrderType.DRINK,3));
        menu.addItemToOrderList(new Order("drink 5", Order.OrderType.DRINK,2));
        menu.addItemToOrderList(new Order("other 2", Order.OrderType.OTHER,1));
        menu.addItemToOrderList(new Order("other 3", Order.OrderType.OTHER,6));
        menu.addItemToOrderList(new Order("drink 6", Order.OrderType.DRINK,1));
        menu.addItemToOrderList(new Order("drink 7", Order.OrderType.DRINK,4));
        menu.addItemToOrderList(new Order("other 4", Order.OrderType.OTHER,1));
        menu.addItemToOrderList(new Order("other 5", Order.OrderType.OTHER,2));

        Iterator barman = menu.getIterator(Order.OrderType.DRINK);
        while (barman.hasNext()) {
            System.out.println("Bar Order: "
                    + barman.next().getItem().toString());
        }

        Iterator chef = menu.getIterator(Order.OrderType.OTHER);
        while (chef.hasNext()) {
            System.out.println("Kitchen Order: "
                    + chef.next().getItem().toString());
        }
    }
}
