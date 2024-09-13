import java.util.Scanner;
public class sumfuction {
    public static int calculatesum(int num1, int num2) {//formal parameter or parameter
        int sum =num1+num2;
        return sum; 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b = sc.nextInt();
        int sum=calculatesum(a,b);//actual parameter or arguments
        System.out.println("sum is "+sum);
    }
}
