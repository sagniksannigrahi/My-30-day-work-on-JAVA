import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    public void testAdd() {
        assertEquals(5, Calculator.add(2, 3));
    }

    @Test
    public void testSubtract() {
        assertEquals(1, Calculator.subtract(3, 2));
    }
}
