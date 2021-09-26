package academy.learnprogramming;

public class Main {
    public static void main(String[] args) {
        System.out.println(canPack(1, 0, 4));
        System.out.println(canPack(1, 0, 5));
        System.out.println(canPack(0, 5, 4));
        System.out.println(canPack(2, 2, 11));
        System.out.println(canPack(-3, 2, 12));
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) { // Validation
            return false;
        }
        if (bigCount * 5 + smallCount < goal) { // Supply must be great than demand
            return false;
        } else {
            return goal % 5 <= smallCount; // regardless of bigCount, remainder of goal has to be less than smallCount
        }
    }
}
