package group30;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class ExponentTest {

    private Exponent exponent;
    private double delta;

    @Before
    void setUp() throws Exception {
        exponent = new Exponent();
        delta = 0.001;

    }

    @Test
    public void testPowerIntegers() {
        assertEquals(exponent.calculate(2, 5), 32.0, delta);
    }

    @Test
    public void testPowerDoubles() {
        assertEquals(exponent.calculate(3.6, 3.2), 60.28, delta);
    }
}