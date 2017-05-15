import designPatterns.behavioral.iterator.IndicatorList;
import designPatterns.behavioral.iterator.IndicatorListImpl;
import designPatterns.behavioral.iterator.Iterator;
import designPatterns.behavioral.iterator.model.Indicator;
import designPatterns.behavioral.iterator.utilities.IndicatorValueType;
import org.junit.Test;

/**
 * @author Siranush.Avetisyan
 * @since 5/15/2017
 */
public class IteratorJUnit {

    @Test
    public void iteratorTest() {
        IndicatorList indicatorList = new IndicatorListImpl();
        indicatorList.addIndicator(new Indicator(1, "Sanitation Total Days", IndicatorValueType.ACTUAL));
        indicatorList.addIndicator(new Indicator(2, "Management Beneficiaries", IndicatorValueType.BASELINE));
        indicatorList.addIndicator(new Indicator(3, "Pupil Attendance Movement", IndicatorValueType.TARGET));
        indicatorList.addIndicator(new Indicator(4, "Opened Days Attendance Movement", IndicatorValueType.TARGET));
        indicatorList.addIndicator(new Indicator(5, "Building Classrooms To Be Repaired", IndicatorValueType.ACTUAL));
        indicatorList.addIndicator(new Indicator(6, "Materials And Equipment FunctionalEquipment", IndicatorValueType.BASELINE));


        System.out.println("Total Number Of Indicator: " + indicatorList.getNumberOfIndicators());

        for (Iterator iterator = indicatorList.createIterator(IndicatorValueType.ACTUAL); iterator.hasNextIndicator(); ) {
            System.out.println("Actual Indicator Name: " + iterator.nextIndicator().getIndicatorName());
        }

        for (Iterator iterator = indicatorList.createIterator(IndicatorValueType.BASELINE); iterator.hasNextIndicator(); ) {
            System.out.println("Base Line Indicator Name: " + iterator.nextIndicator().getIndicatorName());
        }

        for (Iterator iterator = indicatorList.createIterator(IndicatorValueType.TARGET); iterator.hasNextIndicator(); ) {
            System.out.println("Target Indicator Name: " + iterator.nextIndicator().getIndicatorName());
        }
    }

}
