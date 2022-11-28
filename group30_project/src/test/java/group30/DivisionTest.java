package group30;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class DivisionTest {

    private Division division;
    private double delta;

    @Before
    void setUp() throws Exception {
        division = new Division();
        delta = 0.001;

    }

    @Test
    public void testDivideIntegers() {
        assertEquals(division.calculate(10, 3), 3.33, delta);
    }

    @Test
    public void testDivideDoubles() {
        assertEquals(division.calculate(6.2, 3.4), 1.82, delta);
    }
}