package designPatterns.structural.flyweight.model;

import com.sun.istack.internal.NotNull;

/**
 * @author Siranush.Avetisyan
 * @since 5/2/2017
 */
public class SubtractionOperator extends Operation {

    public SubtractionOperator() {
        this.operation = "subtracting";
    }

    @Override
    public void calculate(@NotNull Integer a, @NotNull Integer b) {
        System.out.println(this.operation + " " + a + " and " + b + ": " + (a - b));
    }
}
