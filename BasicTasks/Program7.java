import java.util.*;

public class Program7 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int guess = 0;
        Random rand = new Random();
        int random = rand.nextInt(10);
        while (random!=06) {
            System.out.println("Enter a number:");
            int data = s.nextInt();
            if (data > 10) {
                System.out.println("Your Guess is too high");
                guess++;
            } else if (data == random) {
                System.out.println("Your guess is Correct");
                break;
            } else if (data != random) {
                System.out.println("Your guess is almost there");
                guess++;
            }
        }
        System.out.println("Guesses:" + guess);
    }
}
