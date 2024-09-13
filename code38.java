import java.util.Scanner;
public class code38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr=new int[n-1];
        for(int i=0; i<arr.length;i++){
            arr[i]=sc.nextInt();}
        int a=sc.nextInt();
		int b=sc.nextInt();
		int temp=0;
		for( int i=a;i<b;i++){
			temp+=arr[i-1];}
		System.out.println(temp);
        
    }
    
}
