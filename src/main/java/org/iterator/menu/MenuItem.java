package org.iterator.menu;

public class MenuItem {
    String name;
    String description;
    boolean vegetarian;
    double price;

    public MenuItem(String name, String description, boolean vegetarian, double price) {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    public String name() {
        return name;
    }

    public String description() {
        return description;
    }

    public boolean vegetarian() {
        return vegetarian;
    }

    public double price() {
        return price;
    }
}
