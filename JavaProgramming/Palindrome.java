import java.util.Scanner;

public class Palindrome {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        String newStr = "";
        for (int i = 0; i <str.length(); i++) {
            char ch = str.charAt(i);
            if(ch != ' ')
                newStr = newStr + ch;
        }
        System.out.println(palin(newStr));
    }

    public static boolean palin(String str){
        String newStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);
                newStr = newStr + ch;
        }
        if(newStr.equalsIgnoreCase(str)){
            return true;
        }
        return false;
    }
}

// import java.util.Scanner;

// public class Palindrome{
//     public static void main(String args[]){
//         Scanner s = new Scanner(System.in);
//         String str = s.nextLine().replaceAll("\\s", "").toLowerCase();
//         // str.replaceAll("\\ss", "").toLowerCase();
//         System.out.println(str);
//     }
// }