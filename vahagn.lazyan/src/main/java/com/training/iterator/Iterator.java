package com.training.iterator;

import com.training.iterator.impl.Order;

/**
 * @author vahag
 * @since 14.05.17
 */
public interface Iterator {
    public boolean hasNext();
    public Order next();
}
