// MathOperationsTest.java
package reflection.intermediate.dynamicmethod;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathOperationsTest {
    @Test
    public void testDynamicMethodInvocation() throws Exception {
        MathOperations math = new MathOperations();
        Method addMethod = MathOperations.class.getMethod("add", int.class, int.class);
        Method subtractMethod = MathOperations.class.getMethod("subtract", int.class, int.class);
        Method multiplyMethod = MathOperations.class.getMethod("multiply", int.class, int.class);

        assertEquals(15, addMethod.invoke(math, 10, 5));
        assertEquals(5, subtractMethod.invoke(math, 10, 5));
        assertEquals(50, multiplyMethod.invoke(math, 10, 5));
    }
}