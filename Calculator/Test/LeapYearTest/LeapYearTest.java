package LeapYearTest;

import LeapYear.LeapYear;
import org.junit.Assert;
import org.junit.Test;

public class LeapYearTest {

    @Test
    public void leapYearsAreDivisibleByFour() {
        Assert.assertTrue(LeapYear.isLeapYear(2016));
    }

    @Test
    public void nonLeapYearsAreNotDivisibleByFour(){
        Assert.assertFalse(LeapYear.isLeapYear(3));
    }

    @Test
    public void leapYearsAreDivisibleByFourHundred(){
        Assert.assertTrue(LeapYear.isLeapYear(2020));
    }
}
