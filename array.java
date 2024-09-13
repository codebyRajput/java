public class array {
    
}
import java.util.*;
import java.util.Scanner;
public class Main {
    public staic int firstIndex(int arr[] , int si, int data){
        if(si==arr.length){
            return -1;
        }
        if(arr[si]==data){
            return si;
        }else{
            int rest=firstIndex(arr;si+1,data){
                return rest;
            }
        }
    }
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int[] arr=new int[N];
        for(int i=0;i<N;i++){
            N[i] =sc.nextInt();
        }
        int M=sc.nextInt();
        firstIndex(,0,M);

    }
}
