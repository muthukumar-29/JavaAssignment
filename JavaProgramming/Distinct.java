import java.util.*;

public class Distinct {
    public static void main(String args[]){
        int[] arr = {10,24,72,24,37,10};
        int k=0,duplicate=0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] == arr[j]){
                    arr[i] = 0;
                    duplicate++;
                }
            }
        }

        int[] distinct = new int[arr.length-duplicate];

        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                distinct[k++] = arr[i];
            }
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(distinct));
    }
}