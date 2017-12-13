package module2.lab16.lab5;

public class Main {

    static void foo(int i) {
        System.out.println("int");
    }

    static void foo(byte b) {
        System.out.println("byte");
    }

    static void foo(long l) {
        System.out.println("long");
    }

    static void foo(double d) {
        System.out.println("double");
    }

    static void  foo(Integer integer) {
        System.out.println("Integer");
    }

    public static void main(String[] args) {
        byte b = 5;
        foo(b);
        short s = 55;
        foo(55);
        float f = 43.24F;
        foo(f);

    }
}
