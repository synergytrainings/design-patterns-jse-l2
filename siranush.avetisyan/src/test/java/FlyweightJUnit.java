import designPatterns.structural.flyweight.FlyweightFactory;
import designPatterns.structural.flyweight.model.Operation;
import designPatterns.structural.flyweight.utilities.OperationType;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Siranush.Avetisyan
 * @since 4/12/2017
 */
public class FlyweightJUnit {

    @Test
    public void flyweightTest() {
        Operation operation;

        FlyweightFactory flyweightFactory = FlyweightFactory.getInstance();

        for (int i = 0; i < 4; i++) {
            operation = flyweightFactory.getOperator(OperationType.ADDITION);
            operation.calculate(i, i);

            operation = flyweightFactory.getOperator(OperationType.MULTIPLICATION);
            operation.calculate(i, i);
        }

        assertEquals(flyweightFactory.getTotalNumberOperators(), "2");
    }

}
