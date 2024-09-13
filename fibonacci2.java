public class fibonacci2 {
    public static int fibonacci(int n) {
        int m=1000000007;
        int a=0;
        int b=1;
        int ans=a+b;
        for(int i=2;i<=n-1;i++){
            ans=(a+b)%m;
            a=b;
            b=ans;
        }
        return ans;
        
    }
}
