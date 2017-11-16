package lab2_5.lab2_5_1;

public class MyInitTest {
    private static int counterOfObjects;

    {
        System.out.println("non-static initialization block 1");
        counterOfObjects++;
    }

    {
        System.out.println("non-static initialization block 2");
    }

    static {
        System.out.println("static initialization block 1");
        counterOfObjects++;
    }

    static {
        System.out.println("static initialization block 2");
    }

    public MyInitTest() {
        System.out.println("Constructor 1");
    }

    public MyInitTest(int a) {
        a = 2;
        System.out.println("Constructor 2");
    }

    public static int getCounterOfObjects() {
        return counterOfObjects;
    }
}
