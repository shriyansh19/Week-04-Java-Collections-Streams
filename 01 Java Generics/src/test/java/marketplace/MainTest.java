package marketplace;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CatalogTest {

    @Test
    void testAddProduct() {
        Catalog catalog = new Catalog();
        Product<BookCategory> book = new Product<>("1984", 15.0, new BookCategory("Dystopian"));
        catalog.addProduct(book);

        assertEquals(1, catalog.getAllProducts().size());
    }

    @Test
    void testApplyDiscount() {
        Product<ClothingCategory> shirt = new Product<>("T-Shirt", 20.0, new ClothingCategory("Casual"));
        Catalog catalog = new Catalog();
        catalog.addProduct(shirt);

        catalog.applyDiscount(shirt, 10); // Apply 10% discount
        assertEquals(18.0, shirt.getPrice(), 0.001);
    }

    @Test
    void testDisplayCatalog() {
        Catalog catalog = new Catalog();
        Product<GadgetCategory> gadget = new Product<>("Smartwatch", 199.0, new GadgetCategory("Wearable"));
        catalog.addProduct(gadget);

        // Ensure the catalog contains the added product
        assertTrue(catalog.getAllProducts().contains(gadget));
    }
}