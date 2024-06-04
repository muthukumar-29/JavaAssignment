import java.util.*;

public class ReverseStringArray {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of strings");
        int n = s.nextInt();
        String[] str = new String[n];
        int j =0;
        String[] newStr = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = s.nextLine();
        }

        Arrays.sort(str);
        for(int i=n-1;i>=0;i--){
            newStr[i] = str[j++];
        }
        System.out.println("Array of String reverse: " + Arrays.toString(newStr));
    }
}
