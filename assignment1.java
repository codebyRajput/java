import java.util.Scanner;

public class assignment1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input N
        int N = scanner.nextInt();

        // Input N numbers and store them in an array
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        // Invert the array using a recursive function
        invertArray(arr, 0, N - 1);

        // Print the inverted array
        for (int i = 0; i < N; i++) {
            System.out.print(arr[i] +" ");
        }
    }

    public static void invertArray(int[] arr, int start, int end) {
        if (start > end) {
            return; // Base case: Array is inverted
        }

        // Swap elements at the start and end indices
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        // Recursively invert the subarray
        invertArray(arr, start + 1, end - 1);
    }
}
