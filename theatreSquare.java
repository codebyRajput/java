import java.util.Scanner;
public class theatreSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long m = sc.nextInt();
        long n = sc.nextInt();
        long a = sc.nextInt();
        long count1 =n/a;
        long count2=m/a;
        if(n%a!=0){
            ++count1;
        } 
        if(m%a!=0){
            ++count2;
        }
        System.out.println(count1*count2);
    }
    
}
