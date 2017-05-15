package designPatterns.behavioral.iterator;

import designPatterns.behavioral.iterator.model.Indicator;

/**
 * @author Siranush.Avetisyan
 * @since 5/15/2017
 */
public interface Iterator {

    public Indicator nextIndicator();

    public boolean hasNextIndicator();

}
