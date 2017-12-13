package module2.lab16.lab2_3;

import java.util.Arrays;

public class Main {
    static void foo(int i) {
        System.out.println("int");
    }

    static void foo(Byte b) {
        System.out.println("Byte");
    }

    static void foo(int a, int b) {
        System.out.printf("a = %d, b = %d",a, b);
    }

    static void foo(int... a){
        System.out.println(Arrays.toString(a));
    }


    public static void main(String[] args) {
        byte q = 10;
        foo(q);
        foo(12,43,66);
    }

}
