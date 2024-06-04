import java.util.Scanner;

public class Fibonacci {
    public static void main(String args[]){
        Scanner s= new Scanner(System.in);
        System.out.println("First 10 Fibonacci Sequences");
        int a=0,b=1,c;
        for(int i=0;i<10;i++){
            System.out.println(a);
            c=a+b;
            a=b;
            b=c;
        }
    }
}
