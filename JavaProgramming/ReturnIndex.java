import java.util.*;

public class ReturnIndex {

    public static void findIndex(int[] ary,int ele){
        for(int i=0;i<ary.length;i++){
            if(ary[i] == ele){
                System.out.println("The Element is present in "+ i + " index");
            }
        }
    }
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter total elemets:");
        int n = s.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements one by one...");
        for(int i=0;i<n;i++){
            arr[i] = s.nextInt();
        }

        System.out.println("Enter th element to find index:");
        int fnd = s.nextInt();
        findIndex(arr,fnd);
    }
}
