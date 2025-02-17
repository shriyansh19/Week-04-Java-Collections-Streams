// Main.java
package reflection.basic.privatefield;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) throws Exception {
        Person person = new Person(25);

        Field ageField = Person.class.getDeclaredField("age");
        ageField.setAccessible(true);

        System.out.println("Original Age: " + ageField.get(person));

        ageField.set(person, 30);
        System.out.println("Updated Age: " + ageField.get(person));
    }
}