package JavaBasics;

import java.util.Scanner;

public class OddNumberException {

    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        
        // Read the input number from the user
        int number = scanner.nextInt();
        
        // Close the scanner to prevent resource leak
        scanner.close();

        try {
            // Check if the entered number is even
            if (number % 2 == 0) {
                // If even, print a welcome message
                System.out.println("It's an even number, so welcome!");
            } else {
                // If odd, throw an IllegalArgumentException
                throw new IllegalArgumentException("Odd number entered! Please enter an even number.");
            }
        } catch (IllegalArgumentException e) {
            // Catch and handle the IllegalArgumentException
            // Print the error message
            System.out.println("Error: " + e.getMessage());
        }
    }
}
