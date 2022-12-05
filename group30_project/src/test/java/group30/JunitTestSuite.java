package group30;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)

@Suite.SuiteClasses({
        AdditionTest.class,
        SubtractionTest.class,
        MultiplicationTest.class,
        DivisionTest.class,
        ExponentTest.class,
        SquareRootTest.class,
        LogarithmTest.class,
})
public class JunitTestSuite {
}