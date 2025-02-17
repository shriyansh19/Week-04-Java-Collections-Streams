// Main.java
package reflection.basic.privatemethod;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws Exception {
        Calculator calculator = new Calculator();

        Method multiplyMethod = Calculator.class.getDeclaredMethod("multiply", int.class, int.class);
        multiplyMethod.setAccessible(true);

        int result = (int) multiplyMethod.invoke(calculator, 5, 7);
        System.out.println("Result of multiply: " + result);
    }
}