import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many integer numbers are there: ");
        int size = scanner.nextInt();
        // if the size is negative, then terminate
        if (size < 0) {
            System.out.println("The size can not be negative!");
            System.out.println("Type yes only if you want to try again: ");
            String string = scanner.next().toLowerCase(); // make all in lowercase so that I won't need to worry about yes/Yes/yeS/...etc.
            // check whether the user wants to try again or not.
            if (string.equals("yes")) {
                System.out.println("How many integer numbers are there: ");
                size = scanner.nextInt();
            }
            else
                // if the user type anything else other than yes, it would terminate the program
                System.exit(1);
        }
        int[] array = new int[size];
        for (int i = 0; i < size; i++)
            array[i] = scanner.nextInt();

        // if the array has only 1 value, then that value would be the first largest number
        if (size == 1) {
            System.out.println("The first largest number: " + array[0]);
            System.exit(0);
        }

        // if the array has only 2 values, then one value would be the first largest, and the other one would be the second largest
        if (size == 2) {
            if (array[0] > array[1])
                System.out.println("The first largest number is: " + array[0] + " and the second largest number is " + array[1]);
            else
                System.out.println("The first largest number is: " + array[1] + " and the second largest number is " + array[0]);
            System.exit(0);
        }

        // identifying the first largest number
        int firstLargest = array[0];
        for (int j = 0; j < size; j++) {
            if (array[j] > firstLargest)
                firstLargest = array[j];
        }
        System.out.println("The first largest number: " + firstLargest);
        // identifying the second largest number
        int secondLargest = array[0];
        for (int k = 0; k < size; k++) {
            if (array[k] < firstLargest && array[k] > secondLargest)
                secondLargest = array[k];
        }
        System.out.println("The second largest number: " + secondLargest);
        // identifying the third largest number
        int thirdLargest = array[0];
        for (int l = 0; l < size; l++) {
            if (array[l] < secondLargest && array[l] > thirdLargest)
                thirdLargest = array[l];
        }
        System.out.println("The third largest number: " + thirdLargest);
    }
}