package marketplace;

// Category class for Books
public class BookCategory {
    private String genre;

    public BookCategory(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Book Genre: " + genre;
    }
}