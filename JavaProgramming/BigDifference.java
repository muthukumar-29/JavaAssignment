import java.util.*;

public class BigDifference {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        // System.out.println("Enter total elemets:");
        // int n = s.nextInt();
        // int arr[] = new int[n];
        // System.out.println("Enter the elements one by one...");
        // for(int i=0;i<n;i++){
        // arr[i] = s.nextInt();
        // }

        int[] arr = { 10, 22, 33, 25, 32, 54, 64, 1 };
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[i]>arr[j]){
                    System.out.println(arr[i]);
                }
            }
        }
    }
}
