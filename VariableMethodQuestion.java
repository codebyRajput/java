public class VariableMethodQuestion 
{ 
    int x = 5; 
    void modifyValue(int val) { 
        x += val; 
    } 
    void printValue() { 
        System.out.println("Value: " + x); 
    } 
    public static void main(String[] args) { 
    VariableMethodQuestion obj = new VariableMethodQuestion(); 
    obj.printValue(); 
    obj.modifyValue(3); 
    obj.printValue(); 
    int newValue = 7; 
    obj.modifyValue(newValue); 
    obj.printValue();      
    VariableMethodQuestion anotherObj = new VariableMethodQuestion(); 
    anotherObj.modifyValue(10); 
    anotherObj.printValue(); 
    } 
} 