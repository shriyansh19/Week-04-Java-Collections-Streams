package warehouse;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class StorageTest {

    @Test
    void testAddAndGetItem() {
        Storage<Electronics> storage = new Storage<>();
        Electronics laptop = new Electronics("Laptop");
        storage.addItem(laptop);

        assertEquals(laptop, storage.getItem(0));
    }

    @Test
    void testDisplayAllItems() {
        Storage<Groceries> storage = new Storage<>();
        storage.addItem(new Groceries("Apples"));
        storage.addItem(new Groceries("Bread"));

        List<Groceries> items = storage.getAllItems();
        assertEquals(2, items.size());
    }

    @Test
    void testInvalidIndex() {
        Storage<Furniture> storage = new Storage<>();
        assertThrows(IndexOutOfBoundsException.class, () -> storage.getItem(0));
    }
}