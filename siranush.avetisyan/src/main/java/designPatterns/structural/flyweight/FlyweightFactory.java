package designPatterns.structural.flyweight;

import designPatterns.structural.flyweight.model.Operation;
import designPatterns.structural.flyweight.utilities.OperationType;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Siranush.Avetisyan
 * @since 5/2/2017
 */
public final class FlyweightFactory {

    private static FlyweightFactory INSTANCE;

    private Map<OperationType, Operation> operations = new HashMap<>();

    public static FlyweightFactory getInstance() {
        if (INSTANCE == null) {
            synchronized (FlyweightFactory.class) {
                if(INSTANCE == null) {
                    INSTANCE = new FlyweightFactory();
                }
            }
        }
        return INSTANCE;
    }

    public Operation getOperator(OperationType operationType) {
        if (!this.operations.containsKey(operationType)) {
            this.operations.put(operationType, operationType.getOperation());
        }
        return this.operations.get(operationType);
    }

    public String getTotalNumberOperators() {
        return Integer.valueOf(this.operations.size()).toString();
    }

}
