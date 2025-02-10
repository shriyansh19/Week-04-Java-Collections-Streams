package marketplace;

// Category class for Gadgets
public class GadgetCategory {
    private String type;

    public GadgetCategory(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Gadget Type: " + type;
    }


}