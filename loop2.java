import java.util.Scanner;

/**
 * loop2
 */
public class loop2 {

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int range = Sc.nextInt();
        int counter = 1 ;
        while(counter<=range){
            System.out.print(counter + " ");
            counter ++;
        }
        System.out.println();
        Sc.close();
    }
}