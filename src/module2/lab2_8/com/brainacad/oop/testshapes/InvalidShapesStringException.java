package module2.lab2_8.com.brainacad.oop.testshapes;

import java.util.regex.Pattern;

public class InvalidShapesStringException extends Exception {
    private static final Pattern PATTERN = Pattern.compile("[A-Z][a-z]+:[A-Z]+:\\d+(,\\d+)*");

    public InvalidShapesStringException(String message) {
        super(message);
    }

    public static void isValid(String s) throws InvalidShapesStringException {
        if (!PATTERN.matcher(s).find()) {
            throw new InvalidShapesStringException("String is invalid");
        }
    }
}
