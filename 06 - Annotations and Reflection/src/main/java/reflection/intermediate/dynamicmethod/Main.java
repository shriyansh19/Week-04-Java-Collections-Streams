// Main.java
package reflection.intermediate.dynamicmethod;

import java.lang.reflect.Method;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        MathOperations math = new MathOperations();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter method name (add/subtract/multiply): ");
        String methodName = scanner.next();

        Method method = MathOperations.class.getMethod(methodName, int.class, int.class);
        System.out.print("Enter two integers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int result = (int) method.invoke(math, a, b);
        System.out.println("Result: " + result);
    }
}