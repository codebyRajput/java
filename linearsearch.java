public class linearsearch {
    public static int linear(int number[], int key) {
        for(int i =0;i<=number.length;i++){
            if(number[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int number[]={1,2,3,4,5,6,8,7,9,10};
        int key = 10;
        int index =linear(number, key);
        if(index==-1){
            System.out.println("not found");
        }
        System.out.println(index);
    }
    
}
