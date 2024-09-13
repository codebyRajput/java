import java.util.Scanner;

/**
 * replace
 */
public class replace {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n =sc.nextInt();
        int ans=0;
        int temp;
        while(temp>0){
            int rem=temp%10;
            ans =ans*10+rem;
            temp=temp/10;
        }
        int num;
        if(num==0){
           System.out.println(5);;
        }  
        else{
            while(num>0){
                int digit=num%10;
                if(digit==0)
                   digit=5;
                temp=temp*10+digit;
                num=num/10;
             
        }   
        
    }
}