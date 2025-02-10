package warehouse;

import java.util.List;

// Main class to demonstrate the warehouse system
public class WarehouseMain {
    public static void main(String[] args) {
        // Create storage for Electronics
        Storage<Electronics> electronicsStorage = new Storage<>();
        electronicsStorage.addItem(new Electronics("Laptop"));
        electronicsStorage.addItem(new Electronics("Smartphone"));

        // Create storage for Groceries
        Storage<Groceries> groceriesStorage = new Storage<>();
        groceriesStorage.addItem(new Groceries("Apples"));
        groceriesStorage.addItem(new Groceries("Bread"));

        // Create storage for Furniture
        Storage<Furniture> furnitureStorage = new Storage<>();
        furnitureStorage.addItem(new Furniture("Chair"));
        furnitureStorage.addItem(new Furniture("Table"));

        // Display all items in each storage
        Storage.displayAllItems(electronicsStorage.getAllItems());
        Storage.displayAllItems(groceriesStorage.getAllItems());
        Storage.displayAllItems(furnitureStorage.getAllItems());
    }
}