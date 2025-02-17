// AnnotationTest.java
package reflection.intermediate.annotations;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AnnotationTest {
    @Test
    public void testRetrieveAnnotation() {
        Class<Book> bookClass = Book.class;

        if (bookClass.isAnnotationPresent(Author.class)) {
            Author author = bookClass.getAnnotation(Author.class);
            assertEquals("John Doe", author.name());
        }
    }
}