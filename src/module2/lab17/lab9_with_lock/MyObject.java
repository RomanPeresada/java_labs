package module2.lab17.lab9_with_lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyObject {
    private Lock lock = new ReentrantLock();

    public Lock getLock() {
        return lock;
    }
}
