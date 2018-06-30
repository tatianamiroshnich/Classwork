package lesson19;

import java.io.*;

/**
 * Created by student on 30.06.2018.
 */
public class Animal {

    public static final String FILE_NAME = "testSer.ser";

    public static void main(String[] args) {
        Horse horse1 = new Horse("red");
        Horse horse2 = new Horse("black");

        serialize(horse1, horse2);
        deserialize(2);
    }

    private static void serialize(Horse... horses) {
        try (FileOutputStream fs = new FileOutputStream(FILE_NAME);
             ObjectOutputStream os = new ObjectOutputStream(fs)) {
            for (Horse horse : horses) {
                os.writeObject(horse);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static Horse[] deserialize(int horseNumber) {
        Horse[] horses = new Horse[horseNumber];
        try (FileInputStream fs = new FileInputStream(FILE_NAME);
             ObjectInputStream os = new ObjectInputStream(fs)) {
            for (int i = 0; i < horseNumber; i++) {
                horses[i] = (Horse) os.readObject();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return horses;
    }
}
