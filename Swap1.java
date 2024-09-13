import java.util.Scanner;
public class Swap1 {
     static void swapusing3variable(int a, int b){
        int temp=a;
        a=b;
        b=temp;
        System.out.println("after swapping a become"+a+"and "+"b become"+b);

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int c=sc.nextInt();
        int d = sc.nextInt();
        swapusing3variable(c,d);

    }

}
