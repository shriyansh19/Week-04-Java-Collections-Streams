// CalculatorTest.java
package reflection.basic.privatemethod;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    @Test
    public void testInvokePrivateMethod() throws Exception {
        Calculator calculator = new Calculator();
        Method multiplyMethod = Calculator.class.getDeclaredMethod("multiply", int.class, int.class);
        multiplyMethod.setAccessible(true);

        int result = (int) multiplyMethod.invoke(calculator, 5, 7);
        assertEquals(35, result);
    }
}