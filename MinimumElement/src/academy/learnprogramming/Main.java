package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter count:");
        int count = scanner.nextInt();
        scanner.nextLine();

        int [] returnedArray = readIntegers(count);
        int returnedMin = findMin(returnedArray);
        System.out.println("min = " + returnedMin);
    }

    private static int [] readIntegers (int count) {
        int [] array = new int [count];

        for (int i = 0; i< array.length; i++) {
            System.out.println("Enter a number:");
            int number = scanner.nextInt();
            scanner.nextLine();
            array[i] = number;
        }
        return array;
    }

    private static int findMin (int [] array) {
        int min = Integer.MAX_VALUE;

        for (int i = 0; i< array.length; i++) {
            int value = array[i];
            if (value < min) {
                min = value;
            }
        }
        return min;
    }
}


// Code for Udemy like this will not work,
// the 2 last methods will work but Udemy does not accept the main method so copy/paste
// (if you´re stuck or having major problems) the code below:

/*
import java.util.Arrays;
import java.util.Scanner;

public class MinimumElement {
    Scanner scanner = new Scanner(System.in);
    private static int readInteger(){
        Scanner scanner = new Scanner(System.in);
        int capacity = scanner.nextInt();
        scanner.close();
        return capacity;
    }

    private static int [] readElements (int count) {
        Scanner scanner = new Scanner (System.in);
        int [] array = new int [count];

        for (int i = 0; i< array.length; i++) {
            System.out.println("Enter a number:");
            int number = scanner.nextInt();
            scanner.nextLine();
            array[i] = number;
        }
        return array;
    }

    private static int findMin (int [] array) {
        int min = Integer.MAX_VALUE;

        for (int i = 0; i< array.length; i++) {
            int value = array[i];
            if (value < min) {
                min = value;
            }
        }
        return min;
    }
}

*/
