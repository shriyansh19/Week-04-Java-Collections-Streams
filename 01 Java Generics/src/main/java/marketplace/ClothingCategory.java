package marketplace;

// Category class for Clothing
public class ClothingCategory {
    private String type;

    public ClothingCategory(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Clothing Type: " + type;
    }
}