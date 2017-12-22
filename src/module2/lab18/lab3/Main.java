package module2.lab18.lab3;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale locale = Locale.GERMANY;
        NumberFormat numberFormat = NumberFormat.getNumberInstance();
        NumberFormat money = NumberFormat.getCurrencyInstance(locale);
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.FULL, locale);
        System.out.printf("Current Locale: %s (%s)%n", locale.getLanguage(), locale.getCountry());
        System.out.println("Integer: " + numberFormat.format(234436643));
        System.out.println("Double: " + numberFormat.format(13423.4563));
        System.out.println("Currency: " + money.getCurrency() + " " + money.format(235.45));
        System.out.println(dateFormat.format(new Date()));
        System.out.println("________________________________-");
        Locale localeDefault = Locale.getDefault();
        NumberFormat numberDefaultFormat = NumberFormat.getNumberInstance();
        NumberFormat moneyDefault = NumberFormat.getCurrencyInstance();
        DateFormat defaultDateFormat = DateFormat.getDateInstance(DateFormat.FULL);
        System.out.printf("Current Locale: %s (%s)%n", localeDefault.getLanguage(), localeDefault.getCountry());
        System.out.println("Integer: " + numberDefaultFormat.format(234436643));
        System.out.println("Double: " + numberDefaultFormat.format(13423.4563));
        System.out.println("Currency: " + moneyDefault.getCurrency() + " " + moneyDefault.format(235.45));
        System.out.println(defaultDateFormat.format(new Date()));

    }
}
