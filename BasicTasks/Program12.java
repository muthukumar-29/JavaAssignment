import java.util.*;

/**
 * Program12
 */
public class Program12 {

    public static void main(String args[]) {
        String nchr = "";
        char ch;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a String to reverse:");
        String str = s.nextLine();
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            nchr = ch + nchr;
        }
        System.out.println("The Reversed String is... " + nchr);
    }
}