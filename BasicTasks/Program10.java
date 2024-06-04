import java.util.Scanner;

public class Program10 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num1 = s.nextInt();
        int num2 = s.nextInt();
        int result = num1+num2;
        System.out.println("The Sum of two number is " + result);
    }
}
