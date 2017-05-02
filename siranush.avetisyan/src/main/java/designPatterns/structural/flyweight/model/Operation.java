package designPatterns.structural.flyweight.model;

import com.sun.istack.internal.NotNull;

/**
 * @author Siranush.Avetisyan
 * @since 5/2/2017
 */
public abstract class Operation {

    protected String operation;

    public abstract void calculate(@NotNull Integer a, @NotNull Integer b);

}
