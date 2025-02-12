package com.collections.shoppingcart;

// Main class to demonstrate the shopping cart
public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        // Add products to the cart
        cart.addProduct("Apple", 0.50, 5);
        cart.addProduct("Banana", 0.30, 10);
        cart.addProduct("Orange", 0.75, 3);

        // Display items in insertion order
        cart.displayItemsInInsertionOrder();

        // Display items sorted by price
        cart.displayItemsSortedByPrice();

        // Calculate and display the total cost
        System.out.println("Total Cost: $" + cart.calculateTotalCost());
    }
}