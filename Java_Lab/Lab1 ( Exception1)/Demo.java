package JavaBasics;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;

        try {
            System.out.print("Enter a number: ");
            number = scanner.nextInt(); // Try entering a string here to see the InputMismatchException
            System.out.println("You entered: " + number);
        } catch (InputMismatchException e) {
            System.out.println("InputMismatchException caught: Please enter a valid number.");
            scanner.next(); // Consume the invalid input to prevent an infinite loop
        }

        scanner.close();

}
}
  
