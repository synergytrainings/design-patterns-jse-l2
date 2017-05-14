package com.training.iterator.impl;

import com.training.iterator.Iterator;
import com.training.iterator.impl.Order.OrderType;

import java.util.List;

/**
 * @author vahag
 * @since 14.05.17
 */
public class BarIterator implements Iterator {
    public List<Order> list;
    private int index;

    public BarIterator(List<Order> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        if (index < list.size()) {
            for (int i = index + 1; i < list.size(); i++) {
                if (OrderType.DRINK.equals((list.get(i)).getOrderType())) {
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
            if (OrderType.DRINK.equals((list.get(index).getOrderType()))) {
                item = list.get(index);
                index++;
                break;
            }
        }
        return item;
    }
}
