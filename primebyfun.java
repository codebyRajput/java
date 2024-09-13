public class primebyfun {
    public static boolean prime(int n) {
        boolean prime=true;
        for(int i =2;i<=n-1;i++){
            if(n%i==0){
                prime =false;
                break;
            }
        }
        return prime;
        
    }//checking range
    public static void primeinrange(int n) {
        for(int i=2;i<n;i++){
            if(prime(i)){
                System.out.print(i+" ");
            }

        }
        System.out.println();
           
    }
    public static void main(String[] args) {
        primeinrange(20);
    }
}
