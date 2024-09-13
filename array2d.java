import java.util.Scanner;

/**
 * array2d
 */
public class array2d {

    public static void main(String[] args) {
       /* int[][] arr ={
            {1,2,3,4},
            {5,6,7,8},
            {0,9,8,7}
        };*/
        Scanner sc =new Scanner(System.in);
        int row =sc.nextInt();
        int col=sc.nextInt();
        int[][]arr=new int [row][col];
        for(int i=0;i<=arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]=sc.nextInt();

            }
        }
        System.out.println("print array");

        for( row =0;row<arr.length;row++){
            for( col=0;col<arr[0].length;col++){
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }
    }
}
