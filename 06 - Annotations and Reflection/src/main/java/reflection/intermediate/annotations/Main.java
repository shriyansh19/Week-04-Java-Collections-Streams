// Main.java
package reflection.intermediate.annotations;

import java.lang.annotation.Annotation;

public class Main {
    public static void main(String[] args) {
        Class<Book> bookClass = Book.class;

        if (bookClass.isAnnotationPresent(Author.class)) {
            Author author = bookClass.getAnnotation(Author.class);
            System.out.println("Author Name: " + author.name());
        }
    }
}