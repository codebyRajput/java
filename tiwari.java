/**
 * tiwari
 */
public class tiwari {
    public static void main(String[] args) {
        String str = "trouble", newStr = "";
        String strLowerCase = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char ch = strLowerCase.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                newStr = str.substring(i) + str.substring(0, i)+"ay";
                break;
            }
        }
        System.out.println(newStr);
    }
}