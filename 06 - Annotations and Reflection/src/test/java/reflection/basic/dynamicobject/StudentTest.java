// StudentTest.java
package reflection.basic.dynamicobject;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentTest {
    @Test
    public void testDynamicObjectCreation() throws Exception {
        Class<?> clazz = Class.forName("reflection.basic.dynamicobject.Student");
        Constructor<?> constructor = clazz.getConstructor(String.class);

        Object student = constructor.newInstance("Jane Doe");
        assertEquals("Jane Doe", ((Student) student).getName());
    }
}