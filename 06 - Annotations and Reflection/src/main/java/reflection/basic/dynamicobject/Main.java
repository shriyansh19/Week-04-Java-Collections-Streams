// Main.java
package reflection.basic.dynamicobject;

import java.lang.reflect.Constructor;

public class Main {
    public static void main(String[] args) throws Exception {
        Class<?> clazz = Class.forName("reflection.basic.dynamicobject.Student");
        Constructor<?> constructor = clazz.getConstructor(String.class);

        Object student = constructor.newInstance("John Wick");
        System.out.println("Student Name: " + ((Student) student).getName());
    }
}