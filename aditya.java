import java.util.Scanner;

public class aditya {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter starting position (x1): ");
        int x1 = sc.nextInt();

        System.out.print("Enter number of jumps (n): ");
        int n = sc.nextInt();

        int finalPosition = calculateFinalPosition(x1, n);
        System.out.println("Final position: " + finalPosition);
    }

    public static int calculateFinalPosition(int x1, int n) {
        for (int i = 1; i <= n; i++) {
            if (x1 % 2 == 0) {
                x1 -= i;
            } else {
                x1 += i;
            }
        }
        return x1;
    }
}
