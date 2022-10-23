package org.decorator.final_solution;

public abstract class CondimentDecorator extends Beverage{

    Beverage beverage;

    @Override
    public abstract String getDescription();
}
