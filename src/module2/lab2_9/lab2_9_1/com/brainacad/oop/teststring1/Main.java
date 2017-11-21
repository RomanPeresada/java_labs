package module2.lab2_9.lab2_9_1.com.brainacad.oop.teststring1;

/**
 * Create new project called TestStrings1. Add package “com.brainacad.oop.teststring1”.
 * Create a class Main with a main() method. In method main() declare local variable myStr of String type and assign a value: “abracadabra”.
 * Using the methods of the class String, do next steps:
 * Find the index of first “ra” substring  of myStr value and print result to console.
 * Find the index of last “ra” substring of myStr value and print result to console.
 * Get substring of myStr from 3 to 7 char index and print result to console.
 * Create static method reverseString(String) which return String value as result with changed order of letters (reverse it, for example “abcd” ->”dcba”).
 * Invoke reverseString() method with myStr argument and print result to console.
 * Execute the program.
 */

public class Main {
    public static void main(String[] args) {
        String myStr = "abracadabra";
        System.out.println(myStr.indexOf("ra"));
        System.out.println(myStr.lastIndexOf("ra"));
        System.out.println(myStr.substring(3, 7));
        System.out.println(reverseString(myStr));
    }

    public static String reverseString(String str){
        StringBuilder stringBuilder = new StringBuilder(str);
        return stringBuilder.reverse().toString();
    }
}
