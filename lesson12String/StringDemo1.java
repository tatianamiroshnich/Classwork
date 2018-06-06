package lesson12String;

/**
 * Created by student on 06.06.2018.
 */
public class StringDemo1 {

    public static void indexString(String str) {
        System.out.println("indexOf(Java) = " + str.indexOf("Java"));
        System.out.println("lastIndexOf(люблю) = " + str.lastIndexOf("люблю"));
    }

    public static void replaceSymbol(String str) {
        System.out.println(str.replace('a', 'o'));
    }

    public static void lowerSymbol(String str) {
        System.out.println(str.toLowerCase());
    }

    public static void upperSymbol(String str) {
        System.out.println(str.toUpperCase());
    }

    public static void subSymbol(String str) {
        System.out.println(str.substring(8));
        System.out.println(str.substring(8, 13));
        System.out.println(str.substring(str.indexOf("Java"), str.indexOf("!")));
    }

    public static void main(String[] args) {
        indexString("Я люблю Java!!!");
        replaceSymbol("Я люблю Java!!!");
        upperSymbol("Я люблю Java!!!");
        lowerSymbol("Я люблю Java!!!");
        subSymbol("Я люблю Java!!!");
    }

}
