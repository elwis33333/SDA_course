package zaj01_03_test;

import org.junit.Before;
import org.junit.Test;
import zaj01_03.Calculator;

import static org.junit.Assert.*;

public class CalculatorTest {
    Calculator calc;

    @Before
    public void setUp() {
        calc = new Calculator();

    }

    @Test
    public void testAdd() {
        assertEquals(3.0, calc.add(1.9, 1.1), 0.001);
    }

    @Test
    public void testSub() {
        assertEquals(0.6, calc.sub(1.9, 1.3), 0.001);
    }

    @Test
    public void testMultiply() {
        assertEquals(2.0, calc.multiply(2.0, 1.0), 0.001);
    }

    @Test
    public void testDivide() {
        assertEquals(3.0, calc.divide(9.0, 3.0), 0.001);
    }

    @Test
    public void testInverse() {
        assertEquals(0.5, calc.inverse(2.0), 0.001);
    }
    @Test
    public void testIssOdd() {
        assertTrue(calc.issOdd(3));
    }


}