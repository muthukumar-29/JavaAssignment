import java.util.*;

public class Program5 {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your Age:");
        int age=s.nextInt();
        if(age>0){
        if(age>=18){
            System.out.println("You are an Adult");
        }else{
            System.out.println("You are not yet an Adult");
        }
    }else{
        System.out.println("Invalid Age");
    }
    }
}
