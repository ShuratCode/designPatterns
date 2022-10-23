package org.decorator.multi_fields;

public abstract class Beverage {

    protected String description;

    private boolean milk;
    private boolean soy;
    private boolean mocha;
    private boolean whip;

    private double milkCost = 1.1;
    private double soyCost = 2.2;
    private double mochaCost = 3.3;
    private double whipCost = 4.4;

    public boolean hasMilk() {
        return milk;
    }

    public boolean hasSoy() {
        return soy;
    }

    public boolean hasMocha() {
        return mocha;
    }

    public boolean hasWhip() {
        return whip;
    }

    public double cost() {
        double condimentCost = 0.0;

        if (hasMilk()) {
            condimentCost += milkCost;
        }

        if (hasSoy()) {
            condimentCost += soyCost;
        }

        if (hasMocha()) {
            condimentCost += mochaCost;
        }

        if (hasWhip()) {
            condimentCost += whipCost;
        }

        return condimentCost;
    }

    public String description() {
        return description;
    }
}
