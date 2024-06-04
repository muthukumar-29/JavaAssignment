import java.util.*;
public class StringReverse {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        String newStr = "";
        for(int i=str.length()-1;i>=0;i--){
            newStr = newStr + str.charAt(i);
        }
        System.out.println(newStr);
    }
}