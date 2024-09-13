public class pattern18 {
    public static void main(String[] args) {
        int n=7;
        int nst =1;
        int nsp=n/2;
        int row =n;
        for(int i=1;i<=row;i++){
            for(int csp=1;csp<=nsp;csp++){
                System.out.print(" ");
            }
            for(int cst=1;cst<=nst;cst++){
                System.out.print("*");
            }
            System.out.println();
            if(i<=row/2){
                nst+=2;
                nsp--;
            }else{
                nst-=2;
                nsp++;
            }
        }
    }
}
