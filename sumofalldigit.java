import java.util.Scanner;

public class sumofalldigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no");
        int n = sc.nextInt();
        int sum = 0;
        while(n>0){
            int lastdigit = n%10;
            sum +=lastdigit; 
            n=n/10;
            
        }
        System.out.println("sum is "+sum);
        if (sum % 2 == 0) {
            System.out.println("sum is even ");
        }
        else{
            System.out.println("sum is odd");
        }
        sc.close();
    }
}
