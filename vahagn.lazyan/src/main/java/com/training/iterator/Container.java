package com.training.iterator;

import com.training.iterator.impl.Order;
import com.training.iterator.impl.Order.OrderType;

import java.util.List;

/**
 * @author vahag
 * @since 14.05.17
 */
public interface Container {

    public Iterator getIterator(OrderType type);

    public List<Order> getOrderList();

    public void addItemToOrderList(Order item);

    public void removeItemFromOrderList(Order item);
}
