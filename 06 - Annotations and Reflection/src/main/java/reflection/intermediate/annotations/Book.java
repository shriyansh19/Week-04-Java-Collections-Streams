// Book.java
package reflection.intermediate.annotations;

@Author(name = "Aaemond Targerayan")
public class Book {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}