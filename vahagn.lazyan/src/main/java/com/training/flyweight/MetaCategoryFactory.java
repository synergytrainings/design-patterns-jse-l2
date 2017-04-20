package com.training.flyweight;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author vahag
 * @since 20.04.17
 */
public class MetaCategoryFactory {
    private final Map<String, MetaCategoryId> factory = new ConcurrentHashMap<>();

    synchronized MetaCategoryId lookup(String systemName) {
        if (!factory.containsKey(systemName)) {
            factory.put(systemName, new MetaCategoryId(systemName));
        }
        return factory.get(systemName);
    }

    synchronized int getFactoryItemsCount() {
        return factory.size();
    }
}
