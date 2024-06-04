import java.util.Random;
import java.util.Scanner;

public class Program11 {
    public static void main(String args[]) {
        Random rand = new Random();
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int rand_num = rand.nextInt(100);
        while(num!=0){
            if(num==rand_num){
                System.out.println("Your Guess is Correct");
                break;
            }else if(num<=rand_num){
                System.out.println("");
            }
        }
    }
}
