// ClassInfo.java
package reflection.basic.classinfo;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassInfo {
    public static void displayClassInfo(Class<?> clazz) {
        System.out.println("Class Name: " + clazz.getName());

        // Display Fields
        System.out.println("Fields:");
        for (Field field : clazz.getDeclaredFields()) {
            System.out.println("  " + field);
        }

        // Display Constructors
        System.out.println("Constructors:");
        for (Constructor<?> constructor : clazz.getDeclaredConstructors()) {
            System.out.println("  " + constructor);
        }

        // Display Methods
        System.out.println("Methods:");
        for (Method method : clazz.getDeclaredMethods()) {
            System.out.println("  " + method);
        }
    }
}