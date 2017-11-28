package module2.lab12.lab1;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        MyPhoneBook myPhoneBook = new MyPhoneBook();
        myPhoneBook.addPhoneNumbers("Alex","0956238476");
        myPhoneBook.addPhoneNumbers("Mari","0994372887");
        myPhoneBook.addPhoneNumbers("Sophie","0633472837");
        myPhoneBook.addPhoneNumbers("Alexis","0956350476");
        myPhoneBook.addPhoneNumbers("Denis","0924372887");
        myPhoneBook.addPhoneNumbers("Sokar","0936472837");
        myPhoneBook.addPhoneNumbers("Alexandr","0666238476");
        myPhoneBook.addPhoneNumbers("John","09943728654");
        myPhoneBook.addPhoneNumbers("Maria","0683472837");
        myPhoneBook.addPhoneNumbers("Marina","0663472837");
        myPhoneBook.printPhoneBook();

//        System.out.println("\nSort by Name");
//
//        myPhoneBook.sortByName();
//        myPhoneBook.printPhoneBook();
//
//        System.out.println("\nSort by Number");
//
//        myPhoneBook.sortByNumber();
//        myPhoneBook.printPhoneBook();

        MyPhone myPhone = new MyPhone();
        myPhone.swichOn();
        myPhone.call(1);



    }
}
