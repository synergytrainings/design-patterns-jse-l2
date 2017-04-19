package com.training.flyweight;

/**
 * @author vahag
 * @since 19.04.17
 */
public class MetaCategoryId {
    private final String systemName;

    MetaCategoryId(String systemName) {
        this.systemName = systemName;
    }

    public String getSystemName() {
        return systemName;
    }
}
