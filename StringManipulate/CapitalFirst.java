import java.util.*;

public class CapitalFirst {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a String:");
        String str = s.nextLine();
        String newStr = "";
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                if (i - 1 == 0) {
                    newStr = newStr + Character.toUpperCase(str.charAt(0));
                }
                newStr += str.charAt(i);
            } else {
                newStr = newStr + ' ' + Character.toUpperCase(str.charAt(++i));
            }
        }
        System.out.println(newStr);
    }
}
