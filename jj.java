import java.util.Scanner;
/*public class Main
{
    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in);
        int n;
        int sum = 0;

        while(scn.hasNextInt())
        {
            n = scn.nextInt();
            sum = sum + n;
            if(n > -1000 && n < 1000)
            {
                if(sum >= 0)
                {
                    System.out.println(n);
                }
                else
                {
                    break;
                }
            }
        }
    }
}


public class Main 
{  
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int sum=0,x,i=0;
        int[] arr=new int[9];
        while(sc.hasNext())
        {
         x=sc.nextInt();
         arr[i]=x;
         sum+=x;
         if(sum+arr[i]<0)
                break;
         i++;
        }
        System.out.println();
        for(int j=0;j<i;j++)
        {
            System.out.println(arr[j]);
        }

    }
}*/
public class jj {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Initialize the cumulative sum
    int sum = 0;
    int i = 0;

    // Read the input numbers
    int[] arr = new int[9];
    while (sc.hasNext()) {
      arr[i] = sc.nextInt();
      sum += arr[i];

      // Check if the cumulative sum is non-negative
      if (sum >= 0) {
        i++;
      } else {
        break;
      }
    }

    // Print the numbers
    for (int j = 0; j < i; j++) {
      System.out.println(arr[j]);
    }
  }
}
