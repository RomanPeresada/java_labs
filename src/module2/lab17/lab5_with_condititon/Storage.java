package module2.lab17.lab5_with_condititon;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Storage {
    private int value = 0;
    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public int getValue() {
        return value;
    }
    public void increment(){
        value++;
    }

    public Lock getLock() {
        return lock;
    }

    public Condition getCondition() {
        return condition;
    }
}
