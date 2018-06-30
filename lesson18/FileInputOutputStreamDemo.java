package lesson18;

import java.io.*;

/**
 * Created by student on 30.06.2018.
 */
public class FileInputOutputStreamDemo {
    public static void main(String[] args) {
        try (OutputStream output = new FileOutputStream("src\\io\\a.txt");
             InputStream input = new FileInputStream("src\\io\\a.txt")) {
            char[] c = {'a', 'b', 'c'};
            // Создание текстового файла

            for (char ch : c) {
                // Запись каждого символа в текстовый файл
                output.write(ch);
            }

            int size = input.available();

            for (int j = 0; j < size; j++) {
                // Чтение текстового файла посимвольно
                System.out.print((char) input.read() + " ");
            }

        } catch (IOException e) {
            System.out.print("Exception");
        }
    }
}
