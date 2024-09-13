public class list {
    public static void main(String args[]) {
		int arr[]={1,2,88,-100,49};
        check(arr);

    }
	public static void check(int arr[]){
		int sum=0;
		for(int i=0;i<=arr.length-1;i++){
			sum=sum+i;
			if(sum>0){
			System.out.println(arr[i]);
			}
			else{
				return;
			}
		}
	}
}