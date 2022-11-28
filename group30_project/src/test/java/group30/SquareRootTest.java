package group30;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class SquareRootTest {

    private SquareRoot sqrt;
    private double delta;

    @Before
    void setUp() throws Exception {
        sqrt = new SquareRoot();
        delta = 0.001;

    }

    @Test
    public void testSqrtInteger() {
        assertEquals(sqrt.calculate(16), 4.0, delta);
    }

    @Test
    public void testSqrtDouble() {
        assertEquals(sqrt.calculate(13.2), 3.63, delta);
    }
}