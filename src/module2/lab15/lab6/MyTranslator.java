package module2.lab15.lab6;

import java.util.HashMap;

public class MyTranslator {
    private HashMap<String, String> dictionary;

    public MyTranslator() {
        dictionary = new HashMap<>();
    }

    public void addNewWord(String en, String ru) {
        dictionary.put(en, ru);
    }

    public String translate(String en) {
        return dictionary.get(en);
    }

    public String translateLine(String words) {
        StringBuilder stringBuilder = new StringBuilder();
        String[] arrayOfWords = words.split("[, ]");
        for (int i = 0; i < arrayOfWords.length; i++) {
            stringBuilder.append(dictionary.get(arrayOfWords[i])).append(" ");
        }
        return stringBuilder.toString().trim();
    }
}