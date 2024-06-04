import java.util.Scanner;

public class Program8 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=s.nextInt();
        if(num>0 && num<=100){
            if(num>0 && num<=50){
                System.out.println("The Number is in the lower half");
            }else if(num>50 && num<=100){
                System.out.println("The Number is in the upper half");
            }
        }else{
            System.out.println("Invalid Number");
        }
    }
}
