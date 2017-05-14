package com.training.iterator.impl;

import com.training.iterator.Container;
import com.training.iterator.Iterator;
import com.training.iterator.impl.Order.OrderType;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author vahag
 * @since 14.05.17
 */
public class Menu implements Container {
    private List<Order> orderList = Collections.synchronizedList(new ArrayList<Order>());

    private static volatile Menu INSTANCE = null;

    private Menu() {
        if (INSTANCE != null) {
            throw new IllegalStateException("Already instantiated");
        }
    }

    public static Menu getInstance() {
        if (INSTANCE == null) {
            synchronized (Menu.class) {
                if (INSTANCE == null) {
                    INSTANCE = new Menu();
                }
            }
        }
        return INSTANCE;
    }

    @Override
    public Iterator getIterator(OrderType type) {
        if (type == OrderType.DRINK) {
            return new BarIterator(orderList);
        } else if (type == OrderType.OTHER) {
            return new KitchenIterator(orderList);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @Override
    public List<Order> getOrderList() {
        return orderList;
    }

    @Override
    public void addItemToOrderList(Order item) {
        orderList.add(item);
    }

    @Override
    public void removeItemFromOrderList(Order item) {
        orderList.remove(item);
    }
}
