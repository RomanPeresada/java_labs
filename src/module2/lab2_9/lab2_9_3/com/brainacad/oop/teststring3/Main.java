package module2.lab2_9.lab2_9_3.com.brainacad.oop.teststring3;

/**
 * Create new project called TestStrings3. Add package “com.brainacad.oop.teststring3”.
 * Create a class Main with a main() method.
 * Create static method: uniqueChars(String s), which must  take a String as argument and return an array of distinct (unique) chars (char[]) of the given string.
 * In method main() add code to invoke uniqueChars() method and pass string: “Using methods of class String” as argument. Print result to console.
 * Execute the program.
 */

public class Main {
    public static void main(String[] args) {

        System.out.println(uniqueChars("Using methods of class String"));
    }

    public static char[] uniqueChars(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        int counterOfStep = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < s.length(); j++) {
                if (s.toLowerCase().substring(j, j + 1).equals(s.toLowerCase().substring(i, i + 1))) {
                    counterOfStep++;
                }
                if (counterOfStep > 1) {
                    break;
                }
            }
            if (counterOfStep == 1) {
                stringBuilder.append(s.substring(i, i + 1));
            }
            counterOfStep = 0;
        }
        return stringBuilder.toString().toCharArray();
    }
}
