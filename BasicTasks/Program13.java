import java.util.Scanner;

public class Program13 {
    public static void main(String args[]){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter number of Data:");
        int n=s.nextInt();
        int[] arr=new int[n];
        int temp,sum=0;
        System.out.println("Enter a number one by one:");
        for(int i=0;i<arr.length;i++){
            temp=s.nextInt();
            arr[i]=temp;
            sum+=arr[i];
        }
        System.out.println("The Average of those Numbers:"+sum/n);
    }
}