package JavaBasics;
import java.util.Scanner;

// Define the Loans class
class Loans {
    // Method to calculate loan amount
    public double loanAmount() {
        // Placeholder implementation
        return 0;
    }

    // Method to accept loan details
    public void accept() {
        // Placeholder implementation
    }
}

// Implement the HomeLoan class which extends Loans
public class HomeLoan extends Loans {
    double principal;
    double rate;
    int time;

    // Override the loanAmount method for HomeLoan
    @Override
    public double loanAmount() {
        // Calculate and return the loan amount
        return (principal * rate * time) / 100;
    }

    // Override the accept method for HomeLoan
    @Override
    public void accept() {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter principal amount
        System.out.println("Enter principal amount: ");
        principal = scanner.nextDouble();
        
        // Prompt the user to enter interest rate
        System.out.println("Enter interest rate: ");
        rate = scanner.nextDouble();
        
        // Prompt the user to enter time period in years
        System.out.println("Enter time period (in years): ");
        time = scanner.nextInt();
        
        // Close the scanner object to release resources
        scanner.close();
    }

    // Main method to demonstrate HomeLoan functionality
    public static void main(String[] args) {
        // Create an object of HomeLoan
        HomeLoan homeLoan = new HomeLoan();

        // Accept loan details for HomeLoan
        System.out.println("Enter Home Loan Details:");
        homeLoan.accept();

        // Calculate and display loan amounts for HomeLoan
        System.out.println("Home Loan Amount: " + homeLoan.loanAmount());
    }
}
