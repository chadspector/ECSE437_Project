package group30;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class LogarithmTest {

    private Logarithm log;
    private double delta;

    @Before
    public void setUp() throws Exception {
        log = new Logarithm();
        delta = 0.01;

    }

    @Test
    public void testLogInteger() {
        assertEquals(log.calculate(100), 2.0, delta);
    }

    @Test
    public void testLogDouble() {
        assertEquals(log.calculate(2.2), 0.34, delta);
    }
}