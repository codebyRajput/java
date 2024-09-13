import java.util.Arrays;
import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Reading input
        int[] sticks = new int[4];
        for (int i = 0; i < 4; i++) {
            sticks[i] = scanner.nextInt();
        }
        
        // Sorting the lengths of sticks in non-decreasing order
        Arrays.sort(sticks);
        
        // Check if a triangle can be formed
        if (sticks[0] + sticks[1] > sticks[2] || sticks[1] + sticks[2] > sticks[3]) {
            System.out.println("TRIANGLE");
        } 
        // Check if a degenerate triangle can be formed
        else if (sticks[0] + sticks[1] == sticks[2] || sticks[1] + sticks[2] == sticks[3]) {
            System.out.println("SEGMENT");
        } 
        // If it's impossible to form any triangle
        else {
            System.out.println("IMPOSSIBLE");
        }
    }
}
