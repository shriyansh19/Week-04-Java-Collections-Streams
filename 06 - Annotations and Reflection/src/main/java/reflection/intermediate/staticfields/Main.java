// Main.java
package reflection.intermediate.staticfields;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) throws Exception {
        Field apiKeyField = Configuration.class.getDeclaredField("API_KEY");
        apiKeyField.setAccessible(true);

        System.out.println("Original API Key: " + Configuration.getApiKey());

        apiKeyField.set(null, "new_api_key");
        System.out.println("Updated API Key: " + Configuration.getApiKey());
    }
}