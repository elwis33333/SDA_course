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
public class CalculatorTestParameterizedMultiply {
    Calculator calc;
    int number1;
    int number2;
    int expectedAdd;
    int expectedSub;
    @Parameters(name="{index}: num1: {0}, num2: {1}, expectedAdd: {2}, expectedSub {3}")
    public static Iterable<? extends Object> data(){
        return Arrays.asList(new Object[][]{
            {0,0,0,0}, {1,2,3,-1}, {2,3,5,-1}, {-23,-43,-66,20}});
    }
    public CalculatorTestParameterizedMultiply(int num1, int num2, int expa, int expb){
        this.number1=num1;
        this.number2=num2;
        this.expectedAdd=expa;
        this.expectedSub=expb;
    }
    @Before
    public void setUp(){
        calc = new Calculator();
    }
    @Test
    public void addTest(){
        assertEquals(expectedAdd,calc.add(number1,number2),0.01);
    }
    @Test
    public void subTest(){
        assertEquals(expectedSub,calc.sub(number1,number2),0.01);
    }


}