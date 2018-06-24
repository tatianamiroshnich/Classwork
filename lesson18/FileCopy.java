package lesson18;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by student on 6/24/2018.
 */
public class FileCopy {
    public static void main(String[] args){
        FileInputStream fileIn = null;
        FileOutputStream fileOut = null;
/*
        try {
            fileIn = new FileInputStream("src\\io\\file.txt");
            fileOut = new FileOutputStream("src\\io\\copied_file.txt");

            int a;
            // Копирование содержимого файла file.txt
            while ((a = fileIn.read()) != -1) {
                // Чтение содержимого файла file.txt и запись в copied_file.txt
                fileOut.write(a);
            }
            catch(IOException e){
                System.out.println(e.getMessage());
            }
        } finally {
            if (fileIn != null) {
                fileIn.close();
            }
            if (fileOut != null) {
                fileOut.close();
            }
        }*/
    }
}
