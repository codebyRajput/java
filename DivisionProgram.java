import java.util.Scanner;

public class DivisionProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the numerator: ");
            int numerator = scanner.nextInt();

            System.out.print("Enter the denominator: ");
            int denominator = scanner.nextInt();

            // Check if denominator is zero
            if (denominator == 0) {
                throw new ArithmeticException("Division by zero is not allowed");
            }

            // Perform division
            double result = (double) numerator / denominator;

            System.out.println("Result of division: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: Invalid input. Please enter valid numbers.");
        } finally {
            scanner.close();
        }
    }
}
