import java.util.Scanner;

public class Program14 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a String:");
        String str = s.nextLine();
        String newStr = "";
        char ch;
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            newStr = ch + newStr;
        }
        System.out.println("The Reversed String is..." + newStr);
        if (str.equals(newStr)) {
            System.out.println("The Given String is Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
