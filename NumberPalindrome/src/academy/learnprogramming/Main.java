package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        System.out.println(isPalindrome(125));
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));
    }

    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int lastDigit;
        int num = number;
        while (num != 0) {
            lastDigit = 0;
            lastDigit = num % 10;
            reverse *= 10;
            reverse += lastDigit;
            num /= 10;
        }
        if (reverse == number) {
            return true;
        } else
            return false;
    }

    // Loop 1: num = 125 at first, num/=10 ----> now num = 12
    // Loop 2: num = 12, num/=10 ----> now num = 1
    // Loop 3: num = 1, num/=10 ----> now num = 0 because 1/10 is actually 0.1 but since we're using int values and because 0.1 is not an INT, the value is 0
    // There is no Loop 4 because num is now equal to 0 and the loop doesn't run because of "while(num!=0)..."
}
