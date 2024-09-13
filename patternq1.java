import java.util.Scanner;
public class patternq1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n");
        int n = sc.nextInt();
        System.out.println("enter no of star");
        int nst =sc.nextInt();
        System.out.println("enter no of space");
        int nsp = sc.nextInt();
        int row = n;
        for(int i = 1 ; i<=row ; i++){
            for(int csp =1; csp<=nsp ; csp++){
                System.out.print(" ");
            }
            for(int cst = 1;cst<=nst;cst++){
                System.out.print("*");
            }
            System.out.println();

        }sc.close();
       
    }
}
