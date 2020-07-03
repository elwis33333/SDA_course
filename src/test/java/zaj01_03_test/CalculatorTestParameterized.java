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
public class CalculatorTestParameterized {
Calculator calc;
int number;
@Parameters(name="{index}: isOdd {0}")
    public static Iterable<? extends Object> data(){
    return Arrays.asList(1,3,5,7,9);
}
 public CalculatorTestParameterized(int number){
    this.number=number;
 }
@Before
    public void setUp(){
    calc = new Calculator();
}
@Test
    public void testIsOdd(){
    assertTrue(calc.issOdd(number));
}


}