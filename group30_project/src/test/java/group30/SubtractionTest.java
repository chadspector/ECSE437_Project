package group30;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class SubtractionTest {

    private Subtraction sub;
    private double delta;

    @Before
    void setUp() throws Exception {
        sub = new Subtraction();
        delta = 0.001;

    }

    @Test
    public void testSubtractIntegers() {
        assertEquals(sub.calculate(9, 5), 4.0, delta);
    }

    @Test
    public void testSubtractDoubles() {
        assertEquals(sub.calculate(5.3, 2.2), 3.1, delta);
    }
}