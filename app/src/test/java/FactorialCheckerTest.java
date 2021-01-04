import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactorialCheckerTest {
    @Test
    void CheckFactorialforZero() {
        Factorial factorial = new Factorial(0);

        long FactorialResult= factorial.getFactorial();

        assertEquals(1,FactorialResult);



    }

    @Test
    void CheckFactorialforTwo() {
        Factorial factorial = new Factorial(2);

        long FactorialResult = factorial.getFactorial();

        assertEquals(2,FactorialResult);
    }

    @Test
    void CheckFactorialforFive() {
        Factorial factorial = new Factorial(5);

        long FactorialResult = factorial.getFactorial();

        assertEquals(120,FactorialResult);
    }
}
