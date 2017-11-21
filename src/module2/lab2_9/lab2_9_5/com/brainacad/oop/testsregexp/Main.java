package module2.lab2_9.lab2_9_5.com.brainacad.oop.testsregexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Create new project called TestRegExp. Add package “com.brainacad.oop.testsregexp”.
 * Create a class Main with a main() method.
 * Create public static method checkPersonWithRegExp(String userNameString) which take String as argument and return boolean value.
 * This method must return true only if argument string value begin from Uppercase, then other chars in Lowercase and contains only letters.
 * In main() method declare array of String with next values:
 * {“VOVA”,”Ivan”,”R2d2”,”ZX”,”Anna”,”12345”,”ToAd”,”TomCat”,” “}
 * Add code to check each of these values with checkPersonWithRegExp() method and print result to console.
 * Execute the program.
 */

public class Main {
    public static void main(String[] args) {
        String[] arrayOfString = new String[]{"VOVA", "Ivan", "R2d2", "ZX", "Anna", "12345", "ToAd", "TomCat", " "};
        for (int i = 0; i < arrayOfString.length; i++) {
            System.out.println(arrayOfString[i] + " = " + checkPersonWithRegExp(arrayOfString[i]));
        }

    }

    public static boolean checkPersonWithRegExp(String userNameString) {
        Pattern pattern = Pattern.compile("^([A-Z])[a-z]+");
        Matcher matcher = pattern.matcher(userNameString);
        return matcher.matches();
    }
}
