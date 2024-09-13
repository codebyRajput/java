import java.util.Scanner;

public class Sampleinput {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Read the input numbers
    int[] numbers = new int[scanner.nextInt()];
    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = scanner.nextInt();
    }

    // Initialize the cumulative sum
    int sum = 0;

    // Iterate over the numbers
    for (int i = 0; i < numbers.length; i++) {
      // Update the cumulative sum
      sum += numbers[i];

      // Check if the cumulative sum is negative
      if (sum < 0) {
        // Break the loop
        break;
      }

      // Print the number
      System.out.println(numbers[i]);
    }
  }
}

    

