package module2.lab17.lab11;

import java.util.Random;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;
import java.util.concurrent.ThreadLocalRandom;

class SumOfElementsArray extends RecursiveTask<Long> {
    public static final int N = 1000000;
    private static final int COUNT_OF_THREADS = 2;

    private int start;
    private int end;
    private int[] array;

//    public SumOfElementsArray(int start, int end) {
//        this.start = start;
//        this.end = end;
//    }

    private int[] getArray() {
        return array;
    }

    public SumOfElementsArray(int start, int end, int[] array) {
        this.start = start;
        this.end = end;
        this.array = array.clone();
    }

    @Override
    protected Long compute() {
        long result = 0;
        if ((end - start) < N / COUNT_OF_THREADS) {
            for (int i = start; i < end; i++) {
                result += array[i];
            }
        } else {
            int middle = (end + start) / 2;
            SumOfElementsArray sum1 = new SumOfElementsArray(start, middle, getArray());
            SumOfElementsArray sum2 = new SumOfElementsArray(middle, end, getArray());
            sum1.fork();
            result = sum2.compute() + sum1.join();
        }
        return result;
    }
}

public class Main {

    public static void main(String[] args) {
        int[] array = new int[1000000];
        Random random = ThreadLocalRandom.current();
        long result1 = 0;
        long start = System.currentTimeMillis();
        for (int i = 0; i < SumOfElementsArray.N; i++) {
            array[i] = random.nextInt(100) - 30;
            result1 += array[i];
        }
        long end = System.currentTimeMillis();
        System.out.println("one loop in ms: " + (end - start));
        System.out.println("res1= " + result1);
        ForkJoinPool pool = new ForkJoinPool();
        start = System.currentTimeMillis();
        ForkJoinTask<Long> task = new SumOfElementsArray(0, SumOfElementsArray.N, array);
        long result = pool.invoke(task);
        end = System.currentTimeMillis();
        System.out.println("fork-join in ms: " + (end - start));
        System.out.println("result: " + result);

    }
}
