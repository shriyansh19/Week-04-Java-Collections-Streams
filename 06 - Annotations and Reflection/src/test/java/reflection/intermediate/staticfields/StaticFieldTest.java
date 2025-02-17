// StaticFieldTest.java
package reflection.intermediate.staticfields;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StaticFieldTest {
    @Test
    public void testModifyStaticField() throws Exception {
        Field apiKeyField = Configuration.class.getDeclaredField("API_KEY");
        apiKeyField.setAccessible(true);

        apiKeyField.set(null, "test_api_key");
        assertEquals("test_api_key", Configuration.getApiKey());
    }
}