package lesson12Format;

import java.util.Formatter;

/**
 * Created by student on 10.06.2018.
 */
public class FormatDemo {
    public static void main(String[] args) {
        formatString("Петров", 5, "математике");
        formatString("Иванов", 4, "истории");
        formatString("Сидоров", 3, "физике");
    }

    public static void formatString(String fullName, int mark, String subject) {
        System.out.printf("Студент %15s получил %3d по %10s.%n", fullName, mark, subject);
    }
}
