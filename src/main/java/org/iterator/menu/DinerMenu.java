package org.iterator.menu;

import org.iterator.DinerMenuIterator;

import java.util.Iterator;

public class DinerMenu implements Menu {
    static final int MAX_ITEMS = 6;
    int numOfItems = 0;
    MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];

        addItem("Vegetarian BLT", "(Faking') Bacon with lettuce & tomato on whole wheat", true, 2.99);
        addItem("BLT", "Bacon with lettuce & tomato on whole wheat", false, 2.99);
        addItem("Hot dog", "a hot dog, with sauerkraut, relish, onions, topped with cheese", false, 3.05);
    }

    private void addItem(String name, String description, boolean vegetarian, double price) {
        if (numOfItems >= MAX_ITEMS) {
            System.out.println("Sorry, menu is full~ Can't add item to menu");
        } else {
            menuItems[numOfItems] = new MenuItem(name, description, vegetarian, price);
            numOfItems += 1;
        }
    }

    public Iterator<MenuItem> createIterator() {
        return new DinerMenuIterator(menuItems);
    }
}
