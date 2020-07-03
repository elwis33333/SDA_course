package zaj01_03_test;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import zaj01_03.Calculator;

import java.util.Arrays;

import static org.junit.Assert.*;
@RunWith(Parameterized.class)
public class CalculatorTestParameterizedWithParameters {
    Calculator calc;
    @Parameterized.Parameter(0)
    public double number1;
    @Parameterized.Parameter(1)
    public double number2;
    @Parameterized.Parameter(2)
    public double excepted;

    @Parameters(name="{index}: num1: {0}, num2: {1}, expectedDiv: {2}")
    public static Iterable<? extends Object> data(){
        return Arrays.asList(new Object[][]{
                {1.0,2.0,0.5}, {49.0,7.0,7.0}, {7.0,2.0,3.5}});
    }
    @Before
    public void setUp(){
        calc = new Calculator();
    }
    @Test
    public void testDivide(){
        assertEquals(excepted, calc.divide(number1, number2), 0.04);
    }


}