// ClassInfoTest.java
package reflection.basic.classinfo;

import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class ClassInfoTest {
    @Test
    public void testDisplayClassInfo() {
        assertDoesNotThrow(() -> ClassInfo.displayClassInfo(String.class));
    }
}