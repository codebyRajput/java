import java.util.Scanner;

public class sumoffirst_n_naturalnumber {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        int sum = 0;
        int i= 0;
        while (i<=n){
            sum+= i;
            i++;
        }
        System.out.println("sum is :"+sum);
        Sc.close();
}
}
