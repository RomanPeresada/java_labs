package module3.lab7.lab5;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Main {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        LocalDate birthday = LocalDate.of(1997, 10, 2);
        System.out.println((currentDate.getYear() - birthday.getYear()));

        System.out.println(birthday.getDayOfWeek());
        System.out.println(birthday.plusYears(21).getDayOfWeek());

        Instant instant = Instant.now();
        System.out.println(instant);
        LocalDateTime localDateTimeCurrent = LocalDateTime.now(ZoneId.of("Europe/Kiev"));
        System.out.println(localDateTimeCurrent);
    }
}
