import java.util.*;

public class Program3 {
    public static void main(String args[]){
    int num1,num2;
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the values...");
    num1=s.nextInt();
    num2=s.nextInt();
    if(num1>num2){
        System.out.println("num1 is greater than num2");
    }else if(num1<num2){
        System.out.println("num2 is greater than num1");
    }else{
        System.out.println("num1 is equal to num2");
    }
    }
}
