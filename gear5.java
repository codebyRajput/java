public class gear5 {
    public static void main(String[] args) {
        int arr[]={3,5,7,8,33,66,53,24};
        int max= arr[0];
        int min=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}
