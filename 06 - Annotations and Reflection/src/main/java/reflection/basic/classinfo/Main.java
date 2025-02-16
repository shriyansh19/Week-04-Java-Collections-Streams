// Main.java
package reflection.basic.classinfo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter fully qualified class name: ");
        String className = scanner.nextLine();

        try {
            Class<?> clazz = Class.forName(className);
            ClassInfo.displayClassInfo(clazz);
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found: " + className);
        }
    }
}