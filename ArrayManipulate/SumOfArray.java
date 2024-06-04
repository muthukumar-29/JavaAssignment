import java.util.*;

public class SumOfArray {
 public static void main(String args[]){
    Scanner s = new Scanner(System.in);
    System.out.println("Enter number of elements");
    int n = s.nextInt();
    int[] array = new int[n];
    for(int i=0;i<n;i++){
        array[i] = s.nextInt();
    }
    int sum=0;
    for(int i=0;i<array.length;i++){
        sum += array[i];
    }

    System.out.println("Sum of Array is "+sum);
 }   
}
