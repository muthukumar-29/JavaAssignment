import java.util.*;

public class AverageDoubleArray {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of elements");
        int n = s.nextInt();
        double[] array = new double[n];
        for (int i = 0; i < n; i++) {
            array[i] = s.nextDouble();
        }

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        double avg = sum / array.length;
        System.out.println("Average of all the element in an array is " + avg);
    }
}
