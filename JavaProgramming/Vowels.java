import java.util.*;

public class Vowels{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a String:");
        String str = s.nextLine();
        System.out.println(isVowel(str));
    }

    public static boolean isVowel(String name){
        for(int i=0;i<name.length();i++){
            char ch = Character.toLowerCase(name.charAt(i));
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                return true;
            }
        }
        return false;
    }
}