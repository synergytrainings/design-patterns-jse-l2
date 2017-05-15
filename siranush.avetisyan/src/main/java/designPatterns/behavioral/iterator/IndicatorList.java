package designPatterns.behavioral.iterator;

import designPatterns.behavioral.iterator.model.Indicator;
import designPatterns.behavioral.iterator.utilities.IndicatorValueType;

/**
 * @author Siranush.Avetisyan
 * @since 5/15/2017
 */
public interface IndicatorList {

    public Iterator createIterator(IndicatorValueType indicatorValueType);

    public void addIndicator(Indicator indicator);

    public void removeIndicator(Indicator indicator);

    public Integer getNumberOfIndicators();
}
