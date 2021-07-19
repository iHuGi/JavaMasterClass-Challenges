public class Main {

    public static void main(String[] args) {
        boolean decimal = DecimalComparator.areEqualByThreeDecimalPlaces(2000, 4000);
        System.out.println(decimal);
        decimal = DecimalComparator.areEqualByThreeDecimalPlaces(3.0, 3.0);
        System.out.println(decimal);
    }
}
