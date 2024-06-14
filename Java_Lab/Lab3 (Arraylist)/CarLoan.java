package JavaBasics;
import java.util.Scanner;

// CarLoan class extends Loans class
public class CarLoan extends Loans {
    // Variables to store principal, rate, and time
    double principal;
    double rate;
    int time;

    // Override the loanAmount method to calculate car loan amount
    @Override
    public double loanAmount() {
        return (principal * rate * time) / 100;
    }

    // Override the accept method to accept loan details from user
    @Override
    public void accept() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter car price: ");
        principal = scanner.nextDouble();
        System.out.println("Enter interest rate: ");
        rate = scanner.nextDouble();
        System.out.println("Enter time period (in years): ");
        time = scanner.nextInt();
        scanner.close();
    }

    // Main method to demonstrate CarLoan functionality
    public static void main(String[] args) {
        // Create an object of CarLoan
        CarLoan carLoan = new CarLoan();

        // Accept loan details for CarLoan
        System.out.println("Enter Car Loan Details:");
        carLoan.accept();

        // Calculate and display loan amounts for CarLoan
        System.out.println("Car Loan Amount: " + carLoan.loanAmount());
    }
}
