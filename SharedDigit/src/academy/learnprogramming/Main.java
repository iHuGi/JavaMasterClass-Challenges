package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));
    }

    public static boolean hasSharedDigit (int x, int y) {
        if ((x < 10 || x > 99) || ((y < 10 || y > 99))) {
            return false;
        }
        int temp1 = x % 10;
        int temp2 = x / 10;
        int temp3 = y % 10;
        int temp4 = y / 10;

        return temp1 == temp3 || temp1 == temp4 || temp2 == temp3 || temp2 == temp4;
    }
}
