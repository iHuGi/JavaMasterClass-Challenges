package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        printFactors(6);
        System.out.println("*******");
        printFactors(32);
        System.out.println("*******");
        printFactors(10);
        System.out.println("*******");
        printFactors(-1);
    }

    public static void printFactors (int number) {
        if (number < 1) {
            System.out.println("invalid Value");
        }
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.println(i + " ");
            }
        }
    }
}
