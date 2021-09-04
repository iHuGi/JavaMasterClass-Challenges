package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(41, 22, 71));
        System.out.println(hasSameLastDigit(23, 32, 42));
        System.out.println(hasSameLastDigit(9, 99, 999));
    }

    public static boolean hasSameLastDigit(int num1, int num2, int num3) {
        int sameDigit1 = num1 % 10;
        int sameDigit2 = num2 % 10;
        int sameDigit3 = num3 % 10;
        if (isValid(num1) && isValid(num2) && isValid(num3)) {
            return sameDigit1 == sameDigit2 || sameDigit2 == sameDigit3 || sameDigit3 == sameDigit1;
        } else {
            return false;
        }
    }

    public static boolean isValid(int x) {
        if (x < 10 || x > 1000) {
            return false;
        } else {
            return true;
        }
    }
}
