package marketplace;

import java.util.ArrayList;
import java.util.List;

// Class to manage the product catalog
public class Catalog {
    private List<Product<?>> products;

    public Catalog() {
        products = new ArrayList<>();
    }

    // Add a product to the catalog
    public <T> void addProduct(Product<T> product) {
        products.add(product);
    }

    // Apply a discount to a product
    public <T> void applyDiscount(Product<T> product, double percentage) {
        double discountedPrice = product.getPrice() * (1 - percentage / 100);
        product.setPrice(discountedPrice);
    }

    // Display all products in the catalog
    public void displayCatalog() {
        System.out.println("Products in Catalog:");
        for (Product<?> product : products) {
            System.out.println(product);
        }
    }

    // Get all products in the catalog
    public List<Product<?>> getAllProducts() {
        return products;
    }
}