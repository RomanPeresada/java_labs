package module2.lab15.lab6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MyTranslator myTranslator = new MyTranslator();
        myTranslator.addNewWord("wheel", "колесо");
        myTranslator.addNewWord("hate", "ненависть");
        myTranslator.addNewWord("elephant", "слон");
        myTranslator.addNewWord("ball", "мяч");
        myTranslator.addNewWord("hold","держать");
        myTranslator.addNewWord("turn","поворачивать");
        System.out.println(myTranslator.translate("hate"));
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a words:");
        String input = scanner.nextLine();
        System.out.println(myTranslator.translateLine(input));

    }
}
