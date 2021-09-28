package academy.learnprogramming;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int [] array = {1,2,3,4,5};
        System.out.println("Array = " + Arrays.toString(array)) ;

        reverse(array);
        System.out.println("Reversed Array = " + Arrays.toString(array));
    }

    private static void reverse (int [] array) {
        int maxIndex = array.length - 1;
        int halfLength = array.length / 2;
        for (int i = 0; i<halfLength; i++) {
            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;
        }
    }
}

// This will not Work on Udemy but this is the correct solution, Udemy has some others things to consider.
// The code below will work:

/*import java.util.Arrays;

public class ReverseArray {

    private static void reverse(int[] array){
        System.out.println("Array = " + Arrays.toString(array));
        for(int i=0; i < array.length/2; i++){ // can use half length instead of array.length-1-i
            int temp = array[i];
            array[i] = array[array.length-1-i];
            array[array.length-1-i] = temp;
        }
        System.out.println("Reversed array = " + Arrays.toString(array));
    }
}*/

