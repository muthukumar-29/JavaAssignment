import java.util.*;

public class LongSubstring {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        String sample = "Java is a fully Object Oriented Language";
        System.out.println(findSubString(sample));
    }

    public static String findSubString(String sample){
        String[] strarr = sample.split(" ");
        for(int i=0;i<strarr.length;i++){
            // for(int j=1;j<strarr.length;j++){
                if(strarr[i].length() > strarr[i++].length()){
                    System.out.println(strarr[i]);
                }
            // }
        }
        return null;
    }
}
