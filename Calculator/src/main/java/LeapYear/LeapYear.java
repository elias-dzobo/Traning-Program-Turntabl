package LeapYear;

public class LeapYear {

    public static boolean isLeapYear(int year) {
        return (isDivisible(year, 4) && !(isDivisible(year, 100)) || isDivisible(year, 400));
    }

    private static boolean isDivisible(int year, int num) {
        return year % num == 0;
    }
}
