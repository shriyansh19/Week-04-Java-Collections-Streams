// Configuration.java
package reflection.intermediate.staticfields;

public class Configuration {
    private static String API_KEY = "default_key";

    public static String getApiKey() {
        return API_KEY;
    }
}