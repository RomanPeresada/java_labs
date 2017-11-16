package module1.lab1_6.lab1_6_6;

import java.util.Arrays;

public class AvarageTemperature {
    public static void main(String[] args) {
        int[] arrayTemp = {-19, -11, 1, 8, 15, 20, 29, 30, 22, 14, 4, -12};
        Arrays.sort(arrayTemp);
        System.out.println(Arrays.toString(arrayTemp));
    }
}
