package com.training.singleton;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.Map;

/**
 * @author vahag
 * @since 15.04.17
 */

@Resource
public class Singleton implements Serializable {

    private Map<String, Object> config;
    private boolean isChangeable = true;

    private Singleton() {
    }

    private static class Holder {
        private static final Singleton instance = new Singleton();

        private static Singleton getConfigured(Map<String, Object> config, boolean block) {
            if (instance.isChangeable) {
                instance.config = config;
                instance.isChangeable = !block;
            }else {
                throw new IllegalArgumentException("Object is not changeable");
            }
            return instance;
        }
    }

    public static Singleton getInstance() {
        return Holder.instance;
    }

    public static Singleton getInstance(Map<String, Object> config, boolean block) {
        return Holder.getConfigured(config, block);
    }

    public Map<String, Object> getConfigs() {
        return config;
    }

    public boolean isChangeable() {
        return isChangeable;
    }

}
