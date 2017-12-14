package module2.lab17.account;

public class UserAction extends Thread {
    private final UserAccount acc;
    private int withdraw;

    public UserAction(UserAccount acc, int withdraw) {
        this.acc = acc;
        this.withdraw = withdraw;
    }

    @Override
    public void run() {
        synchronized (acc) {
            int has = acc.get();
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (has >= withdraw) {
                acc.set(acc.get() - withdraw);
            }

        }
    }
}
