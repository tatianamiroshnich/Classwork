package lesson13Date;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class DateTime {
    public static void main(String[] args) {
        LocalDate birth = LocalDate.of(1998, 1, 25);
        LocalDate today = LocalDate.now();

        boolean after = birth.isAfter(today);
        boolean before = birth.isBefore(today);

        int year = birth.getYear();
        int month = birth.getMonthValue();
        Month monthAsEnum = birth.getMonth();
        int dayYear = birth.getDayOfYear();
        int dayMonth = birth.getDayOfMonth();
        DayOfWeek dayWeekEnum = birth.getDayOfWeek();

        System.out.println("Год: " + year);
        System.out.println("Месяц: " + month);
        System.out.println("Название месяца: " + monthAsEnum);
        System.out.println("День в году: " + dayYear);
        System.out.println("День месяца: " + dayMonth);
        System.out.println("День недели: " + dayWeekEnum);
        System.out.println("birth.isAfter(today) = " + after + "  birth.isBefore(today) = " + before);
    }
}
