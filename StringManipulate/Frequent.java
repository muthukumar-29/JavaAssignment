import java.util.*;

public class Frequent {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a String:");
        String str = s.nextLine();
        HashMap<Character, Integer> hash = new HashMap<Character, Integer>();
        char chars;
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            chars = str.charAt(i);
            if (chars != ' ') {
                if (hash.containsKey(chars)) {
                    count = hash.get(chars);
                    hash.put(chars, ++count);
                } else {
                    count = 0;
                    hash.put(chars, ++count);
                }
            }
        }
        char[] key = new char[hash.size()];
        int[] value = new int[hash.size()];
        int index = 0, index1 = 0;
        for (char i : hash.keySet()) {
            key[index++] = i;
            value[index1++] = hash.get(i);
        }
        System.out.println(hash);
        System.out.println("Most Frequent Character:" + key[greater(value)]);
    }

    public static int greater(int[] value) {
        for (int i = 0; i < value.length; i++) {
            for (int j = i + 1; j < value.length; j++) {
                if (value[i] > value[j]) {
                    return i;
                }
            }
        }
        return 0;
    }
}
