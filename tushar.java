import java.util.Scanner;

public class tushar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d =sc.nextInt();

        int x2= 0;
        if(x2%2==0){
            x2=x2-d;
        }else{
            x2=x2+d;
        }
        System.out.println(x2);
    }
}
