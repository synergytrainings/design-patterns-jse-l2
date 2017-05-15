package designPatterns.behavioral.iterator.model;

import designPatterns.behavioral.iterator.utilities.IndicatorValueType;

/**
 * @author Siranush.Avetisyan
 * @since 5/15/2017
 */
public class Indicator {

    private Integer indicatorInstanceId;
    private String indicatorName;
    private IndicatorValueType indicatorValueType;

    public Indicator(Integer indicatorInstanceId, String indicatorName, IndicatorValueType indicatorValueType) {
        this.indicatorInstanceId = indicatorInstanceId;
        this.indicatorName = indicatorName;
        this.indicatorValueType = indicatorValueType;
    }

    public Integer getIndicatorInstanceId() {
        return indicatorInstanceId;
    }

    public String getIndicatorName() {
        return indicatorName;
    }

    public IndicatorValueType getIndicatorValueType() {
        return indicatorValueType;
    }
}
