// PersonTest.java
package reflection.basic.privatefield;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTest {
    @Test
    public void testAccessPrivateField() throws Exception {
        Person person = new Person(25);
        Field ageField = Person.class.getDeclaredField("age");
        ageField.setAccessible(true);

        assertEquals(25, ageField.get(person));

        ageField.set(person, 30);
        assertEquals(30, ageField.get(person));
    }
}