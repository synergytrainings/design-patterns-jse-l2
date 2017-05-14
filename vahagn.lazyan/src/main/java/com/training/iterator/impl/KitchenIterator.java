package com.training.iterator.impl;

import com.training.iterator.Iterator;

import java.util.List;

/**
 * @author vahag
 * @since 14.05.17
 */
public class KitchenIterator implements Iterator {
    public List<Order> list;
    private int index;

    public KitchenIterator(List<Order> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        if (index < list.size()) {
            for (int i = index + 1; i < list.size(); i++) {
                if (Order.OrderType.OTHER.equals((list.get(i)).getOrderType())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public Order next() {
        Order item = null;
        for (; index < list.size(); index++) {
            if (Order.OrderType.OTHER.equals((list.get(index).getOrderType()))) {
                item = list.get(index);
                index++;
                break;
            }
        }
        return item;
    }
}
