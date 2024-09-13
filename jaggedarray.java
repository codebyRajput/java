public class jaggedarray {
    public static void main(String[] args) {
        //declaring 2d array 
        int arr[][]=new int[2][];
        //making the jagged array by instantiating columns later 
        arr[0]=new int[3];//first row has 3 columns 
        arr[1]= new int[2];//second row has 2 columns
        int count =1;
        //taking input of jagged array 
        for(int i = 0; i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=count++;//updating value
            }
        }
        //displaying 2d jagged array
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
