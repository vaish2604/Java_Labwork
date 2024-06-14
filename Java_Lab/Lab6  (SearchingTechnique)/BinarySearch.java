package Searching;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

    public static void main(String[] args) {
    	// TODO Auto-generated method stub
        // Initialize variables
        int len, key;
        int[] array;
        
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the array length
        System.out.println("Enter array length:");
        len = input.nextInt();

        // Initialize the array with the given length
        array = new int[len];

        // Prompt the user to enter the array elements
        System.out.println("Enter " + len + " elements:");
        for (int i = 0; i < len; i++) {
            array[i] = input.nextInt();
        }

        // Sort the array
        Arrays.sort(array);
        System.out.println("Sorted array: " + Arrays.toString(array));

        // Prompt the user to enter the search key
        System.out.println("Enter the search key value:");
        key = input.nextInt();

        // Perform binary search
        int result = binarySearch(array, key);

        // Output the result
        if (result == -1) {
            System.out.println(key + " doesn't exist in array.");
        } else {
            System.out.println(key + " is present at location " + (result + 1));
        }
    }

    // Method to perform binary search
    public static int binarySearch(int[] array, int key) {
        int left = 0;
        int right = array.length - 1;

        // Continue searching while the left index is less than or equal to the right index
        while (left <= right) {
            // Calculate the middle index
            int mid = left + (right - left) / 2;

            // Check if the key is at the middle index
            if (array[mid] == key) {
                return mid;  // Key found
            }

            // If the key is greater, ignore the left half
            if (array[mid] < key) {
                left = mid + 1;
            }
            // If the key is smaller, ignore the right half
            else {
                right = mid - 1;
            }
        }

        // Key not found
        return -1;
    }
}

