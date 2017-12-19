package module2.lab17.lab7_with_executors;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Bank {
    private int accounts[];
    private int numOfAccounts;
 //   private Lock lock = new ReentrantLock();

    public Bank(int num_accounts, int init_balance) {
        accounts = new int[num_accounts];
        numOfAccounts = num_accounts;
        for (int i = 0; i < accounts.length; i++) {
            accounts[i] = init_balance;
        }
    }

    void transfer(int from, int to, int amount) {
      //  lock.lock();
        try {
            System.out.println("from: " + from + " to: " + to +
                    " amount: " + amount);

            if (accounts[from] < amount) return;
            accounts[from] = accounts[from] - amount;
            Thread.sleep((int) (100 * Math.random()));
            accounts[to] = accounts[to] + amount;

            System.out.println("Total balance: " + totalBalance());

        } catch (InterruptedException e) {
        }
//        finally {
//            lock.unlock();
//        }
    }

    public int totalBalance() {
        int total = 0;
        for (int v : accounts) {
            total = total + v;
        }
        return total;
    }

    public int getNumberAccounts() {
        return numOfAccounts;
    }


}



