import java.util.*;
public class PrintName {
    public static void display(String name){
        System.out.println(name);
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        String name=s.nextLine();
        display(name);
    }
}
