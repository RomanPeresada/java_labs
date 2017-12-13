package module2.lab17.lab3;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[] myArray = new int[1000];
        MySumCount mySumCount1 = new MySumCount();
        MySumCount mySumCount2 = new MySumCount();
        Thread thread1 = new Thread(mySumCount1);
        Thread thread2 = new Thread(mySumCount2);
        for (int i = 0; i < 1000; i++) {
            myArray[i] = random.nextInt(1000);
        }
        mySumCount1.setArray(myArray);
        mySumCount1.setStartIndex(34);
        mySumCount1.setStopIndex(99);
        mySumCount2.setArray(myArray);
        mySumCount2.setStartIndex(66);
        mySumCount2.setStopIndex(291);
        thread1.start();
        thread2.start();


    }
}
