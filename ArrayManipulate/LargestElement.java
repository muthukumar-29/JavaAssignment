import java.util.*;

public class LargestElement {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of elements");
        int n = s.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = s.nextInt();
        }

        Arrays.sort(array);
        System.out.println("Largest Element in an array is "+array[n-1]);
    }
}
