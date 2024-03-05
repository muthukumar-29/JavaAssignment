import java.util.*;
public class Program4 {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a value:");
        int num=s.nextInt();
        if(num>0){
            System.out.println("Positive Number");
        }else if(num<0){
            System.out.println("Negative Number");
        }else{
            System.out.println("Zero");
        }
    }
}
