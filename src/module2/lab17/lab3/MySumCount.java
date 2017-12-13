package module2.lab17.lab3;

public class MySumCount implements Runnable{
    private int startIndex;
    private int stopIndex;
    private int[] array;
    private long resultSum;


    @Override
    public void run() {
        for (int i = startIndex; i <= stopIndex; i++) {
            resultSum += array[i];
        }
        System.out.println("sum of " + Thread.currentThread().getName() + " = " + resultSum);
    }

    public long getResultSum() {
        return resultSum;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public int getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    public int getStopIndex() {
        return stopIndex;
    }

    public void setStopIndex(int stopIndex) {
        this.stopIndex = stopIndex;
    }
}
