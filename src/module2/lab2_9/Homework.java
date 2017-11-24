package module2.lab2_9;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Homework {

    public static final Pattern PATTERN = Pattern.compile("(0)|(-?\\d+)\\.\\d+");

    public static boolean checkNumberWithRegExp(String string){
        return PATTERN.matcher(string).matches();
    }

    public static void main(String[] args) {

        double number = 32.4321;
        String string ="";
        string += number;
        String string1 = "0.43243";
        String string2 = "4.432423";
        String string3 = "-14.43243";
        System.out.println(checkNumberWithRegExp(string));

        System.out.println(checkNumberWithRegExp(string1));
        System.out.println(checkNumberWithRegExp(string2));
        System.out.println(checkNumberWithRegExp(string3));

    }

}
