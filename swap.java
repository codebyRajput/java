/**
 * swap
 */
public class swap {
    public static void swapnum(int a ,int b) {
        int temp=a;
        a=b;
        b=temp;
        System.out.println(a);
        System.out.println(b);
    }
    public static void main(String[] args) {
        int a=10;
        int b=33;
        swapnum(a,b);
    }
}
