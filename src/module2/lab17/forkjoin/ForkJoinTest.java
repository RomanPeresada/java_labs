package module2.lab17.forkjoin;

import java.math.BigInteger;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;

public class ForkJoinTest {

    static class SumTask extends RecursiveTask<BigInteger> {
        private final BigInteger N = new BigInteger("10000000");
        private final BigInteger NUMBER_OF_THREADS = new BigInteger("15");
        private BigInteger range2 = N.divide(NUMBER_OF_THREADS);

        private BigInteger start;
        private BigInteger end;

        public BigInteger getN() {
            return N;
        }

        public SumTask(BigInteger start, BigInteger end) {
            this.start = start;
            this.end = end;
        }

        public SumTask() {
            this.start = BigInteger.ONE;
            this.end = N;
        }

        @Override
        protected BigInteger compute() {
            BigInteger result = BigInteger.ZERO;
            BigInteger range1 = end.subtract(start);

            if (range1.compareTo(range2) == -1) {
                for (BigInteger bigI = BigInteger.ONE; bigI.compareTo(N) <= 0; bigI = bigI.add(BigInteger.ONE)) {
                    result = result.add(bigI);
                }
            } else {
                BigInteger middle = (start.add(end)).divide(new BigInteger("2"));

                SumTask sum1 = new SumTask(start, middle);
                SumTask sum2 = new SumTask(middle.add(BigInteger.ONE), end);

                sum1.fork();
                System.out.printf("Forked task into 1) from %d to %d; 2) from %d to %d%n", start, middle, middle.add(BigInteger.ONE), end);
                BigInteger second = sum2.compute();
                BigInteger first = sum1.join();
                result = first.add(second);
            }
            return result;
        }
    }

    public static void main(String[] args) {

        ForkJoinTask<BigInteger> task = new SumTask();
        ForkJoinPool pool = new ForkJoinPool();
        long start = System.currentTimeMillis();
        BigInteger result = pool.invoke(task);
        long end = System.currentTimeMillis();
        System.out.println("in ms: " + (end - start));
        System.out.println("result: " + result);

    }
}
