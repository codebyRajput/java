import java.util.Scanner;

public class MonthDaysCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the name of the month
        System.out.print("Enter the name of the month: ");
        String monthName = scanner.nextLine();

        // Convert the month name to lowercase to make the comparison case-insensitive
        monthName = monthName.toLowerCase();

        // Check the number of days based on the month name
        int daysInMonth = 0;
        switch (monthName) {
            case "january":
            case "march":
            case "may":
            case "july":
            case "august":
            case "october":
            case "december":
                daysInMonth = 31;
                break;
            case "april":
            case "june":
            case "september":
            case "november":
                daysInMonth = 30;
                break;
            case "february":
                daysInMonth = 28; // Assuming a non-leap year
                break;
            default:
                System.out.println("Invalid month name.");
                System.exit(1);
        }

        // Display the result
        System.out.println("Number of days in " + monthName + ": " + daysInMonth);

        scanner.close();
    }
}
