//import java.util.Scanner;

public class sumbyarray {
    public static void main(String[] args) {
       // Scanner sc =new Scanner(System.in);
        int[] marks={18,17,23,16,28};
        int sum = 0;
        for(int i=0;i<marks.length;i++){
            sum =marks[i]+sum;
        }
        System.out.println("sum is sum "+sum);
    }
    
}
