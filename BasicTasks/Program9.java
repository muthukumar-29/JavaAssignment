import java.util.Scanner;

public class Program9 {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a String:");
        String str=s.nextLine();
        Boolean p = str.contains("Java");
        if(p){
            System.out.println("The String Contain Java");
        }else{
            System.out.println("The String Doesn't Contain Java");
        }
    }
}
