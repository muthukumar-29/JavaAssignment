import java.util.Scanner;

public class BasicLast {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        for(int i=1;i<=20;i++){
            System.out.println(i+"*"+num+"="+i*num);
        }
    }
}
