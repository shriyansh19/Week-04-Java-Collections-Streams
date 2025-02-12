package com.collections.shoppingcart;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ShoppingCartTest {

    @Test
    void testAddProduct() {
        ShoppingCart cart = new ShoppingCart();
        cart.addProduct("Apple", 0.50, 5);

        assertEquals(5, cart.getCartItems().get("Apple"));
    }

    @Test
    void testCalculateTotalCost() {
        ShoppingCart cart = new ShoppingCart();
        cart.addProduct("Apple", 0.50, 5);
        cart.addProduct("Banana", 0.30, 10);

        assertEquals(5.50, cart.calculateTotalCost(), 0.001);
    }
}