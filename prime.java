import java.util.Scanner;
public class prime {
    public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		long N=sc.nextLong();
		for(int i=2;i<=N-1;i++){
			if(N%i==0){
				System.out.println("not prime");
                break;
			} else{
                System.out.println("prime");
            }
		}
        
    }
}

