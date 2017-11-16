package module2.lab2_5.lab2_5_1;

public class Test {
    public static void main(String[] args) {
        MyInitTest m = new MyInitTest();
        MyInitTest m1 = new MyInitTest();
        MyInitTest m2 = new MyInitTest(2);
        System.out.println(m2.getCounterOfObjects());
    }
}
