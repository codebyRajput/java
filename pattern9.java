public class pattern9 {
    public static void main(String[] args) {
        int n=5;
        int nst =1;
        int nsp =4;
        int row =n;
        for(int i=1;i<=row;i++){
            for(int csp=1; csp<=nsp;csp++){
                System.out.print(" ");
            }
            for(int cst=1;cst<=nst;cst++){
                System.out.print("*");
            }
            System.out.println();
            nst=nst+2;
            nsp--;
        }
    }
}
