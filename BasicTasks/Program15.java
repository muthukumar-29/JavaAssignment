import java.util.*;

public class Program15 {
    public static void main(String args[]) {
        int[] arr = { 10, 20, 40, 5, 47 };
        Arrays.sort(arr);
        System.out.println("Largest Number:" + arr[arr.length-1]);
        System.out.println("smallest Number:" + arr[0]);
    }
}
