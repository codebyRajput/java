import java.util.Scanner;

/**
 * practice
 */
public class checkpass_fail {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        float avg =a+b+c/3;
        if ((avg>=40)&&(a>=33)&&(b>=33)&&(c>=33)){
            System.out.println("pass");
        }else{
            System.out.println("fail");
        }
        
    }
}