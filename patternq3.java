public class patternq3 {
    public static void main(String[] args) {
        int n=5;
        int nst=5;
        int nsp=0;
        int row =n;
        for(int i=1;i<=row;i++){
            for(int csp =1;csp<=nsp;csp++){
                System.out.print("");
            }
            for(int cst =1;cst<=nst;cst++){
            System.out.print("*");
            }
            System.out.println();
            nsp++;
            nst--;
        }
    }
}
