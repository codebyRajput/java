import java.util.Scanner;

public class gcd {
    static int gc(int n1,int n2){
        for(int i=1;i<=n1&&i<=n2;i++){
            if(n1%i==0&&n2%i==0)
            
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n1= sc.nextInt();
        int n2 = sc.nextInt();
        int gcd = 1 ;

        System.out.println(gcd);
sc.close();
    }
}

 
/**
public class gcd {
 
    // gcd() method, returns the GCD of a and b
    static int gcd(int a,int c){
    {
        int gcd=1;
 
        // take a loop iterating through smaller number to 1
        for (int i = 1; i<=a&&i<=c ; i++) {
 
            // check if the current value of i divides both
            // numbers with remainder 0 if yes, then i is
            // the GCD of a and b
            if (a % i == 0 && c % i == 0)
                gcd=i;
        }}
 
        // if there are no common factors for a and b other
        // than 1, then GCD of a and b is 1
    }
    // Driver method
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
 
        // calling gcd() method over
        // the integers 30 and 20
        System.out.println( gcd(a.c));
    }
}*/