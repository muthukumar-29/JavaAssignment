import java.util.Scanner;

public class CountWord {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a String:");
        String str = s.nextLine();
        String[] word = new String[10];
        word = str.split(" ");
        int count=0;
        for(String m : word){
            count++;
        }
        System.out.println(count);
    }
}
