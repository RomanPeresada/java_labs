package module2.lab11.lab4;

import java.util.regex.Pattern;

public class InvalidShapeStringException extends Exception{
    public static final Pattern PATTERN = Pattern.compile("[A-Z][a-z]+:[A-Z]+:(\\d+,?)+");
    public InvalidShapeStringException(String message) {
        super(message);
    }
    public static void test(String s) throws InvalidShapeStringException{
        if(!PATTERN.matcher(s).find()){
            throw new InvalidShapeStringException("String is invalid");
        }
    }
}
