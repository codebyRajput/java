import java.util.Scanner;
public class pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n");
        int n = sc.nextInt();
        System.out.println("enter no of star");
        int nst =sc.nextInt();
        System.out.println("enter no of space");
        int nsp = sc.nextInt();
        System.out.println("enter no of row ");
        int row = sc.nextInt();
        for(int i = 1 ; i<=row ; i++){
            for(int csp =1; csp<=nsp ; csp++){
                System.out.print(" ");
            }
            for(int cst = 1;cst<=nst;cst++){
                System.out.print("*");
            }
            System.out.println();
            if(i<=row/2){
                nst--;
                nsp+=2;
            }else{
                nst++;
                nsp-=2;
            }
        }
       
    }
}
