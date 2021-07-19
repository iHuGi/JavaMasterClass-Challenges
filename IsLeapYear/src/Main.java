public class Main {

    public static void main(String[] args) {

        boolean leap = IsLeapYear.isLeapYear(2000);
        System.out.println(leap);
        leap = IsLeapYear.isLeapYear(1997);
        System.out.println(leap);
        leap = IsLeapYear.isLeapYear(1997);
        System.out.println(leap);
        leap = IsLeapYear.isLeapYear(1600);
        System.out.println(leap);
        leap = IsLeapYear.isLeapYear(2400);
        System.out.println(leap);
        leap = IsLeapYear.isLeapYear(3250);
        System.out.println(leap);
    }
}
