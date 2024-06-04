import java.util.HashMap;
import java.util.Scanner;

public class Frequent {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        HashMap<Character, Integer> hash = new HashMap<Character, Integer>();
        char chars;
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            chars = str.charAt(i);
            if (chars!=' ') {
                hash.put(chars, ++count);
                if()
            }
        }
        // System.out.println(hash);
    }
}
