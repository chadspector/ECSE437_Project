package group30;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class AdditionTest {

    private Addition addition;
    private double delta;

    @Before
    public void setUp() throws Exception {
        addition = new Addition();
        delta = 0.01;

    }

    @Test
    public void testAddIntegers() {
        assertEquals(addition.calculate(4, 5), 9.0, delta);
    }

    @Test
    public void testAddDoubles() {
        assertEquals(addition.calculate(2.2, 5.3), 7.5, delta);
    }
}