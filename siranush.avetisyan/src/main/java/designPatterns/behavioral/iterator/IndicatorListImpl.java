package designPatterns.behavioral.iterator;

import designPatterns.behavioral.iterator.model.Indicator;
import designPatterns.behavioral.iterator.utilities.IndicatorValueType;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Siranush.Avetisyan
 * @since 5/15/2017
 */
public class IndicatorListImpl implements IndicatorList {

    private List<Indicator> indicatorList;

    public IndicatorListImpl() {
        this.indicatorList = new ArrayList<>();
    }

    @Override
    public Iterator createIterator(IndicatorValueType indicatorValueType) {
        return new IteratorImpl(indicatorValueType);
    }

    @Override
    public void addIndicator(Indicator indicator) {
        this.indicatorList.add(indicator);
    }

    @Override
    public void removeIndicator(Indicator indicator) {
        this.indicatorList.remove(indicator);
    }

    @Override
    public Integer getNumberOfIndicators() {
        return this.indicatorList.size();
    }

    private class IteratorImpl implements Iterator {

        private Integer position;
        private IndicatorValueType indicatorValueType;

        private IteratorImpl(IndicatorValueType indicatorValueType) {
            this.position = 0;
            this.indicatorValueType = indicatorValueType;
        }

        @Override
        public Indicator nextIndicator() {
            return indicatorList.get(this.position++);
        }

        @Override
        public boolean hasNextIndicator() {
            while (this.position < indicatorList.size()) {
                Indicator indicator = indicatorList.get(this.position);
                if (indicator.getIndicatorValueType().equals(this.indicatorValueType)) {
                    return true;
                } else {
                    this.position++;
                }
            }
            return false;
        }
    }
}
