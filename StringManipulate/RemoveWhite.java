import java.util.*;

public class RemoveWhite {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a String:");
        String str = s.nextLine();
        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                newStr += str.charAt(i);
            }
        }
        System.out.println(newStr);
    }
}
