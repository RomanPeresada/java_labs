package lab2_5.lab2_5_5;

public class Main {
    public static void main(String[] args) {
        InitTest[] initTests = new InitTest[5];
        for (int i = 0; i < initTests.length; i++) {
            initTests[i] = new InitTest();
            System.out.println(initTests[i].getId());
        }
    }
}
