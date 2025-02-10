package warehouse;

import java.util.ArrayList;
import java.util.List;

// Generic class to store items of type T, where T extends WarehouseItem
public class Storage<T extends WarehouseItem> {
    private List<T> items;

    public Storage() {
        items = new ArrayList<>();
    }

    // Add an item to the storage
    public void addItem(T item) {
        items.add(item);
    }

    // Retrieve an item by index
    public T getItem(int index) {
        if (index >= 0 && index < items.size()) {
            return items.get(index);
        }
        throw new IndexOutOfBoundsException("Invalid index: " + index);
    }

    // Display all items in the storage (using wildcard)
    public static void displayAllItems(List<? extends WarehouseItem> items) {
        System.out.println("Items in storage:");
        for (WarehouseItem item : items) {
            System.out.println(item);
        }
    }

    // Get all items in the storage
    public List<T> getAllItems() {
        return items;
    }
}