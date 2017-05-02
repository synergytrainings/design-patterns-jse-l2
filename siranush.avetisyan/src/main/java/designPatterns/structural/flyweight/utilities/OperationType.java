package designPatterns.structural.flyweight.utilities;

import designPatterns.structural.flyweight.model.*;

/**
 * @author Siranush.Avetisyan
 * @since 5/2/2017
 */
public enum OperationType {

    ADDITION {
        @Override
        public Operation getOperation() {
            return new AdditionOperator();
        }
    }, SUBTRACTION {
        @Override
        public Operation getOperation() {
            return new SubtractionOperator();
        }
    }, MULTIPLICATION {
        @Override
        public Operation getOperation() {
            return new MultiplicationOperator();
        }
    }, DIVISION {
        @Override
        public Operation getOperation() {
            return new DivisionOperator();
        }
    };

    public abstract Operation getOperation();

}
