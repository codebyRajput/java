public class linear {
    public static int linearsearch(String abc[], String key){
        for(int i=0;i<=abc.length;i++){
            if(abc[i]==key){
                return i;
            }
        }
        return -1;
    }   
    public static void main(String[] args){
        String abc[]={"apple","mango","banana","pineapple","orange"};
        String key="orange";
        int index = linearsearch(abc,key);
        if(index==-1){
            System.out.println("not found");
        }else{
            System.out.println("key is at :"+index);
        }
    }
}   
