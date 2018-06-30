package lesson18;

import java.io.*;

/**
 * Created by student on 30.06.2018.
 */
public class FileReaderDemo {
    public static void main(String[] args) throws IOException {
        try (BufferedReader fileReader = new BufferedReader(new FileReader("file.txt"));
             BufferedWriter fileWriter = new BufferedWriter(new FileWriter("copyFile.txt"))) {
            String str;
            while ((str = fileReader.readLine()) != null) {
                fileWriter.write(str);
                fileWriter.newLine();
            }
        }
    }
}
