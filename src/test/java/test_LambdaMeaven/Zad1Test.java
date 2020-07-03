package test_LambdaMeaven;

import LambdaMeaven.LambdaZad1;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.List;
public class Zad1Test {
    LambdaZad1 zad1;
    @Before
    public void setUp(){
        zad1 = new LambdaZad1();
    }
    @Test
    public void sortListTest(){
        List<String> list = Arrays.asList("task","car","vehicle");
        assertEquals(Arrays.asList("car","task","vehicle"), zad1.sortList(list));
    }
    @Test
    public void sortListLambdaTest(){
        List<String> list = Arrays.asList("task","car","vehicle");
        assertEquals(Arrays.asList("car","task","vehicle"), zad1.sortListLambda(list));
    }
    @Test
    public void sortArrayTest(){
        String[] strings = new String[]{"task","car","vehicle"};
        assertArrayEquals(new String[]{"car","task","vehicle"}, zad1.sortArray(strings));
    }
}