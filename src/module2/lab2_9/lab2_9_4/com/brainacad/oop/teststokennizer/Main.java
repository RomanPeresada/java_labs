package module2.lab2_9.lab2_9_4.com.brainacad.oop.teststokennizer;

import java.util.StringTokenizer;

/**
 * Create new project called TestTokennizer.
 * Add package “com.brainacad.oop.teststokennizer”.
 * Create a class Main with a main() method.
 * In method main() declare local variables myStr add code which split a string by “space” “comma” and “.dot”
 * delimiter using StringTokennizer  class, and iterate the StringTokenizer elements and print it out one by one to console.
 * String myStr = “This is String, split by StringTokenizer. Created by Student:Name of Student”.
 * Execute the program.
 */

public class Main {
    public static void main(String[] args) {
        String myStr = "This is String, split by StringTokenizer. Created by Student:Name of Student";
        splitStringBySpace(myStr);
        splitStringByComma(myStr);
        splitStringByDot(myStr);

    }

    public static void splitStringBySpace(String s) {
        StringTokenizer stringTokenizer = new StringTokenizer(s);
        while (stringTokenizer.hasMoreElements()) {
            System.out.println(stringTokenizer.nextElement());
        }
        System.out.println("*************");
    }

    public static void splitStringByComma(String s) {
        StringTokenizer stringTokenizer = new StringTokenizer(s, ",");
        while (stringTokenizer.hasMoreElements()) {
            System.out.println(stringTokenizer.nextElement());
        }
        System.out.println("*************");
    }

    public static void splitStringByDot(String s) {
        StringTokenizer stringTokenizer = new StringTokenizer(s, ".");
        while (stringTokenizer.hasMoreElements()) {
            System.out.println(stringTokenizer.nextElement());
        }
        System.out.println("*************");
    }
}
