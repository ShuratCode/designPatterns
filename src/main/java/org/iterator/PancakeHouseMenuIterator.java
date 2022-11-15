package org.iterator;

import org.iterator.menu.MenuItem;

import java.util.Iterator;
import java.util.List;

public class PancakeHouseMenuIterator implements Iterator<MenuItem> {
    List<MenuItem> menuItems;
    int position = 0;

    public PancakeHouseMenuIterator(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        return position < menuItems.size();
    }

    @Override
    public MenuItem next() {
        MenuItem item = menuItems.get(position);
        position = position + 1;
        return item;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Your are not suppose to delete menu items");
    }
}
