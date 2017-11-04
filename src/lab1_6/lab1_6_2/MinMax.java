package lab1_6.lab1_6_2;

import java.util.Arrays;

public class MinMax {
    public static void main(String[] args) {
        int[] m = new int[] { 10, 21, 5, 22, 9, 29, 25, 22, 11, 14, 8, 14 };
        Arrays.sort(m);
        int min=m[0];
        int max=m[m.length-1];
        int average =0;
        for(int x:m)
        {
            average+=x;
        }
        average/=m.length;
        System.out.println(Arrays.toString(m));
        System.out.println("Min = "+min);
        System.out.println("Max = "+max);
        System.out.println("Average = "+average);
    }
}
