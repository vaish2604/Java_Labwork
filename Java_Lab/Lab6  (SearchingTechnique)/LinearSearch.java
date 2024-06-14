package Searching;

import java.util.Scanner;

public class LinearSearch {

    public static void main(String[] args) {
    	// TODO Auto-generated method stub
        int i, len, key;// Variable declaration
        int[] array;

        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the array length
        System.out.println("Enter Array length:");
        len = input.nextInt();

        // Initialize the array with the given length
        array = new int[len];

        // Prompt the user to enter the array elements
        System.out.println("Enter " + len + " elements:");
        for (i = 0; i < len; i++) {
            array[i] = input.nextInt();
        }

        // Prompt the user to enter the search key value
        System.out.println("Enter the search key value:");
        key = input.nextInt();

        // Perform linear search to find the key in the array
        for (i = 0; i < len; i++) {
            if (array[i] == key) {
                // If key is found, print its position (1-based index) and exit the loop
                System.out.println(key + " is present at location " + (i + 1));
                break;
            }
        }

        // If the loop completes without finding the key, print that it doesn't exist
        if (i == len) {
            System.out.println(key + " doesn't exist in array.");
        }

        // Close the scanner object
        input.close();
    }
}
