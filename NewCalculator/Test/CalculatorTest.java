import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void testAddition() {
        int a = 2;
        char b = '+';
        int c = 7;
        int res = Calculator.calculate(a, b, c);
        Assert.assertEquals(9, res);
    }

    @Test
    public void testSub() {
        int a = 6;
        char b = '-';
        int c = 4;
        int res1 = Calculator.calculate(a, b, c);
        int res2 = Calculator.calculate(c, b, a);

        Assert.assertEquals(2, res1);
        Assert.assertEquals(-2, res2);
    }

    @Test
    public void testMul(){
        int a = 72;
        char b = '*';
        int c = 2;
        int d = 0;
        int res1 = Calculator.calculate(a, b, c);
        int res2 = Calculator.calculate(a, b, d);

        Assert.assertEquals(144, res1);
        Assert.assertEquals(0, res2);
    }

    @Test
    public void testDiv(){
        int a = 144;
        char b = '/';
        int c = 12;

        int res = Calculator.calculate(a, b, c);

        Assert.assertEquals(12, res);
    }

    @Test
    public void testIrregularities(){
        int a = 144;
        char b = '/';
        int c = 3;


    }

    @Test
    public void testDivZero() {
        int a = 12;
        char b = '/';
        int c = 0;

        Assert.assertThrows(ArithmeticException.class, () -> Calculator.calculate(a, b, c));
    }



}