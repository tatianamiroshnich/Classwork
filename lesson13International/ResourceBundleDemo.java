package lesson13International;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleDemo {
    public static void main(String[] args) {
        printTopics(Locale.ENGLISH);
        printTopics(new Locale("ru", "RU"));
        printTopics(new Locale("ua","UA"));
    }

    public static void printTopics(Locale locale) {
        ResourceBundle resourceBundle =
                ResourceBundle.getBundle("topic", locale);
        System.out.println(locale);
        for (String key : resourceBundle.keySet()) {
            String value = resourceBundle.getString(key);
            System.out.println(value);
        }
    }
}
