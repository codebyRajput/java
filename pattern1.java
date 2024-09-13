public class pattern1 {
    public static void main(String[] args) {
        int n=5;
        int nst =n;//no of star
        int nsp = 0; // no of space
        int row = n;
        for (int i=1;i<=row;i++){
        //space
           for(int csp=1;csp<=nsp;csp++){
              System.out.print(" ");
           } 
           //star
           for(int cst=1;cst<=nst;cst++){
               System.out.print("*");
            }
            System.out.println();
            nst++;
            nsp--;

        } 
    }
}             
