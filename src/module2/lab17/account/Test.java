package module2.lab17.account;

public class Test {
    public static void main(String[] args) {
        UserAccount acc = new UserAccount(1000);
        for (int i = 0; i < 300; i++) {
            new UserAction(acc,100).start();
        }
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(acc.get());
    }
}
