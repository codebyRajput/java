/**
public class a {

    public static void main(String[] args) {
        int a =10;
        int b =a++;
        System.out.println(a);
        System.out.println(b);
}
}
*/
/**
 * a
 */
// public class a {
//     public static int sum(int a ,int b) {
//         return a+b;
        
//     }
//     public static int sum(int a,int b,int c) {
//         return a+b+c;
        
//     }
//     public static float sum(float a,float b) {
//         return a+b;
        
//     }

//     public static void main(String[] args) {
//         System.out.println(sum(4,7));
//         System.out.println(sum(2,3,4));
//         System.out.println(sum(7.5f,8.5f));
//     }
// }
/**
 * a
 */
public class a {

    public static int func1(int a,int b){
        int sum;
        sum =a+b;
        return sum;
        
    }
    public static void func2(){
        System.out.println("aditya");
    }
    public static void main(String[] args) {
        int a=12;
        int b = 3;
        int sum=func1(a,b);
        System.out.println(sum);
        func1(a,b);
        func2();
    }
}