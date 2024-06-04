import java.util.Scanner;

public class Fibonacci {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = s.nextInt();
        // 0 1 1 2 3 5 8 13
        int a = 0, b = 1, c;
        if (num > 0) {
            System.out.println("Fibonacci Series:\n"+0);
            for (int i = 0; i < num; i++) {
                c = a + b;
                a = b;
                b = c;
                System.out.println(c);
            }
        }
    }
}
