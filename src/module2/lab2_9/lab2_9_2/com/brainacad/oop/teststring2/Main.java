package module2.lab2_9.lab2_9_2.com.brainacad.oop.teststring2;

/**
 * Create new project called TestStrings2. Add package “com.brainacad.oop.teststring2”.
 * Create a class Main with a main() method.
 * In method main() declare two local variables myStr1 and myStr2 of String type and assign a value “Cartoon” for first string and ”Tomcat” for second.
 * Write code to display all of the letters, which are present in the first word, but absent in the second.
 */

public class Main {
    public static void main(String[] args) {
        String myStr1 = "Cartoon";
        String myStr2 = "Tomcat";
        System.out.println(findAbsentLetters(myStr1, myStr2));

    }

    public static String findAbsentLetters(String s1, String s2) {
        StringBuilder stringBuilder = new StringBuilder();
        int counterOfStep = 0;
        for (int i = 0; i < s1.length(); i++) {
            for (int j = 0; j < s2.length(); j++) {
                if (!s2.toLowerCase().substring(j, j + 1).equals(s1.toLowerCase().substring(i, i + 1))) {
                    counterOfStep++;
                }
                if (counterOfStep == s2.length()) {
                    stringBuilder.append(s1.substring(i, i + 1));
                }
            }
            counterOfStep = 0;
        }
        return stringBuilder.toString();
    }
}
