import java.util.*;
public class Program16 {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        String[] arr= new String[10];
        System.out.println("Enter Number of Names:");
        int n=s.nextInt();
        for(int i=0;i<n;i++){
            arr[i] = s.nextLine();
        }

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i].compareTo(arr[j])>0){
                    String temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("The Sorting Names:");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}
