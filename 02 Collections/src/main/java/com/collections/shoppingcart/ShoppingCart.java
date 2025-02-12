package com.collections.shoppingcart;

import java.util.*;

// Class to manage a shopping cart using different types of maps
public class ShoppingCart {
    private Map<String, Double> productPrices = new HashMap<>(); // HashMap for product prices
    private Map<String, Integer> cartItems = new LinkedHashMap<>(); // LinkedHashMap for insertion order
    private Map<Double, String> sortedItems = new TreeMap<>(); // TreeMap for sorting by price

    // Add a product to the cart
    public void addProduct(String product, double price, int quantity) {
        productPrices.put(product, price);
        cartItems.put(product, cartItems.getOrDefault(product, 0) + quantity);
        sortedItems.put(price, product);
    }

    // Display items in insertion order
    public void displayItemsInInsertionOrder() {
        System.out.println("Items in insertion order:");
        cartItems.forEach((product, quantity) -> System.out.println(product + ": " + quantity));
    }

    // Display items sorted by price
    public void displayItemsSortedByPrice() {
        System.out.println("Items sorted by price:");
        sortedItems.forEach((price, product) -> System.out.println(product + ": $" + price));
    }

    // Calculate the total cost of the cart
    public double calculateTotalCost() {
        double total = 0;
        for (Map.Entry<String, Integer> entry : cartItems.entrySet()) {
            String product = entry.getKey();
            int quantity = entry.getValue();
            total += productPrices.get(product) * quantity;
        }
        return total;
    }
}