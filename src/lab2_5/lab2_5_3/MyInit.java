package lab2_5.lab2_5_3;

import java.util.Arrays;
import java.util.Random;

public class MyInit {
    private static int[] array;

     {
        array = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = (random.nextInt(19) - 6);
        }
    }

    public void printArray() {
        System.out.println(Arrays.toString(array));
    }
}


