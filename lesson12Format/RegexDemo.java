package lesson12Format;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by student on 10.06.2018.
 */
public class RegexDemo {
    public static void main(String[] args) {
        String regex = "(Java\\s+\\d{1,2})";
        String s = "Versions: Java  5, Java 6, Java   7, Java 8.";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(s);
        while (matcher.find()) {
            System.out.println(" " + matcher.group());
        }

    }
}
