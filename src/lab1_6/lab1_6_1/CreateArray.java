package lab1_6.lab1_6_1;

import java.util.Arrays;

public class CreateArray {
    public static void main(String[] args) {
        int[] array = new int[15];
        int m=2;
        for (int i = 0; i < 15; i++) {
            array[i]=m;
            m+=2;
        }
        System.out.println(Arrays.toString(array));
    }
}
