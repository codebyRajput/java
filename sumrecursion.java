public class sumrecursion {
    public static void main(String[] args) {
        int n=5;
        int sum= sumof(n);
        System.out.println(sum);

    }
    public static int sumof(int n){ 
        while(n==1){
            return 1;
        }
        return n+ sumof(n-1);
    }
}
