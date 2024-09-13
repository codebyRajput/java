import java.util.Scanner;
class InvalidInputException extends Exception {
    public InvalidInputException(String message) {
        super(message);
    }
}

public class CustomExceptionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a number: ");
            String userInput = scanner.nextLine();

            if (!isNumeric(userInput)) {
                throw new InvalidInputException("Invalid input. Please enter a numeric value.");
            }

            double number = Double.parseDouble(userInput);

            System.out.println("Entered number: " + number);
        } catch (InvalidInputException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid numeric format.");
        } finally {
            scanner.close();
        }
    }

    private static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
