import java.util.Scanner;

public class OddNumber2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            if (number <= 10 && number >= 0) {
                System.out.println("Положительное число меньше 10");
            } else {
                System.out.println("Положительное число больше 10 или отрицательное");
            }
        } else {
            System.out.println("Вы ввели не целое число");
        }

    }
}
