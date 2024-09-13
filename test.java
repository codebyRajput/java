import java.util.Scanner;

public class test {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Initialize the cumulative sum
    int sum = 0;
    int i = 0;

    // Read the input numbers
    int[] arr = new int[9];
    while (sum >= 0) {
      arr[i] = sc.nextInt();
      sum += arr[i];
      i++;
    }

    // Print the numbers
    for (int j = 0; j < i; j++) {
      System.out.println(arr[j]);
    }
  }
}
