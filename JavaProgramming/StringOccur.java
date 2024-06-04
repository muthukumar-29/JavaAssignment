import java.util.*;

public class StringOccur {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        System.out.println("Enter a character to remove:");
        String ch = s.nextLine();
        char chr = ch.charAt(0);
        String newStr="";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == chr) {
                // System.out.println(str.charAt(i));
                String remove = Character.toString(str.charAt(i));
                // Character.toString(str.charAt(i));
                newStr = str.replace(remove, "");
            }
        }
        System.out.println(newStr);
    }
}
