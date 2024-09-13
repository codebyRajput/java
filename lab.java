public class lab {
  void display(int n){
    int count=1;
    if(count>n){
      return;
    }else{
      System.out.println(count);
    }
    count++;
    display(n);
  }
  public static void main(String[] args) {
    lab ad=new lab();
    ad.display(5);
  }
}