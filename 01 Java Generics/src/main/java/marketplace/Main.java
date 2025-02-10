package marketplace;

// Main class to demonstrate the marketplace
public class Main {
    public static void main(String[] args) {
        // Create categories
        BookCategory fiction = new BookCategory("Fiction");
        ClothingCategory shirt = new ClothingCategory("Shirt");
        GadgetCategory smartphone = new GadgetCategory("Smartphone");

        // Create products
        Product<BookCategory> book = new Product<>("The Song of Ice and Fire", 20.0, fiction);
        Product<ClothingCategory> clothing = new Product<>("Blue Shirt", 25.0, shirt);
        Product<GadgetCategory> gadget = new Product<>("IQOO Z3 5G", 999.0, smartphone);

        // Create catalog and add products
        Catalog catalog = new Catalog();
        catalog.addProduct(book);
        catalog.addProduct(clothing);
        catalog.addProduct(gadget);

        // Display catalog before discount
        catalog.displayCatalog();

        // Apply discounts
        catalog.applyDiscount(book, 10); // 10% discount on book
        catalog.applyDiscount(gadget, 15); // 15% discount on gadget

        // Display catalog after discount
        System.out.println("\nAfter Discounts:");
        catalog.displayCatalog();
    }
}