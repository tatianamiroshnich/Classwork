package lesson12String;

/**
 * Created by student on 06.06.2018.
 */
public class StringBuildingDemo {
    public static void main(String[] args) {
        print(3, 4);
        print(45, 8);
    }

    public static void print(int a, int b) {
        StringBuilder str = new StringBuilder(50);
        str.append(a).append(" + ").append(b).append(" = ").append(a + b).append("\n");
        str.append(a).append(" - ").append(b).append(" = ").append(a - b).append("\n");
        str.append(a).append(" * ").append(b).append(" = ").append(a * b).append("\n");

        int pos = -1;
        while ((pos = str.indexOf("=")) != -1) {
            str.replace(pos, pos + 1, "равно");
        }
        System.out.println(str);

    }
}
