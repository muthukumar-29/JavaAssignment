import java.util.*;
public class Program6 {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the temperature in Celsius:");
        float celsius=s.nextFloat();
        float fahrenheit=(celsius*9/5)+32;
        System.out.println("Temperature in fahrenheit:"+fahrenheit);
    }
}
