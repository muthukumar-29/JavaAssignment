import java.util.*;

public class ArraySort {
    public static void main(String args[]) {
        int[] m = { 2, 5, 27, 41, 69, 52, 96, 17, 62, 56 };
        int odd[] = new int[m.length / 2];
        int oddposition[] = new int[m.length / 2];
        int evenposition[] = new int[m.length / 2];
        int j = 0, k = 0, a = 0, b = 0,c=0;
        for (int i = 0; i < m.length; i++) {
            if (i % 2 == 0) {
                odd[j++] = m[i];
            } else {
                evenposition[k++] = m[i];
            }
        }
        Arrays.sort(evenposition);
        Arrays.sort(odd);

        for (int x = odd.length - 1; x >= 0; x--) {
            oddposition[a++] = odd[x];
        }

        System.out.println("ODD:" + Arrays.toString(oddposition));
        System.out.println("EVEN:" + Arrays.toString(evenposition));

        for (int i = 0; i < m.length; i++) {
            if (i % 2 == 0) {
                m[i] = evenposition[b++];
            } else {
                m[i] = oddposition[c++];
            }
        }
        System.out.println(Arrays.toString(m));
    }
}
