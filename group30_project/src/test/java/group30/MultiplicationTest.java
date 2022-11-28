package group30;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class MultiplicationTest {

    private Multiplication multiplication;
    private double delta;

    @Before
    public void setUp() throws Exception {
        multiplication = new Multiplication();
        delta = 0.01;

    }

    @Test
    public void testMultiplyIntegers() {
        assertEquals(multiplication.calculate(4, 5), 20.0, delta);
    }

    @Test
    public void testMultiplyDoubles() {
        assertEquals(multiplication.calculate(2.2, 5.3), 11.66, delta);
    }
}