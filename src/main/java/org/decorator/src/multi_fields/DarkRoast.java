package org.decorator.src.multi_fields;

public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "Most Excellent Dark Roast";
    }

    @Override
    public double cost() {
        return 1.99 + super.cost();
    }
}
