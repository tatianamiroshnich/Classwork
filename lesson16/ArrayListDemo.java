package lesson16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by student on 6/17/2018.
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        List<HeavyBox> collection = getHeavyBoxes();
        printCollection(collection);
        changeBox(collection, 0, 1);
        removeLastElement(collection);

        createArrays(collection);

        collection.clear();
        System.out.println(collection);
    }

    private static void createArrays(List<HeavyBox> collection) {
        Object[] array1 = collection.toArray();
        System.out.println(Arrays.toString(array1));

        HeavyBox[] array2 = new HeavyBox[collection.size()];
        collection.toArray(array2);
        System.out.println(Arrays.toString(array2));

        HeavyBox[] array3 = collection.toArray(new HeavyBox[0]);
        System.out.println(Arrays.toString(array3));
    }

    private static void removeLastElement(List<HeavyBox> collection) {
        int index = collection.size() - 1;
        collection.remove(index);
        printCollection(collection);
    }

    private static void changeBox(List<HeavyBox> collection, int index, int weight) {
        HeavyBox box = collection.get(index);
        box.weight = box.weight + 1;
        System.out.println(box);
    }

    private static void printCollection(List<HeavyBox> collection) {
        for (HeavyBox box : collection) {
            System.out.println(box);
        }
        System.out.println();
    }

    private static List<HeavyBox> getHeavyBoxes() {
        List<HeavyBox> collection = new ArrayList<>();
        collection.add(new HeavyBox(1, 1, 1, 1));
        collection.add(new HeavyBox(1, 2, 1, 1));
        collection.add(new HeavyBox(1, 1, 2, 1));
        return collection;
    }
}
