import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n=sc.nextInt();
        int row =sc.nextInt();
        for(int i= 0;i<=row;i++){
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();


        }
        
    }
}
