package lab1_6.lab1_6_4;

import java.util.Arrays;

public class SearchElement {
    public static void main(String[] args) {
        int[] ar = new int[20];
        for(int i=0;i<20;i++) {
            ar[i] = i * 4;
        }
        Arrays.sort(ar);
        int index = Arrays.binarySearch(ar,40);
        System.out.println("Index = "+index);
    }
}
