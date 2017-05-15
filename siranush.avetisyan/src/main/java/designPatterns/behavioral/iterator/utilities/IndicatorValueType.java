package designPatterns.behavioral.iterator.utilities;

/**
 * @author Siranush.Avetisyan
 * @since 5/15/2017
 */
public enum IndicatorValueType {
    BASELINE(1),
    TARGET(2),
    ACTUAL(3);

    private Integer valueTypeId;

    IndicatorValueType(Integer valueTypeId) {
        this.valueTypeId = valueTypeId;
    }

    public Integer getValueTypeId() {
        return valueTypeId;
    }
}
