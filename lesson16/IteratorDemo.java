package lesson16;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by student on 20.06.2018.
 */
public class IteratorDemo {
    public static void main(String[] args) {
        List<HeavyBox> arrayList = new ArrayList<>();

        arrayList.add(new HeavyBox(1, 2, 3, 300));
        arrayList.add(new HeavyBox(1, 2, 3, 200));
        arrayList.add(new HeavyBox(1, 2, 3, 400));

        System.out.println(arrayList);

        List<HeavyBox> newCollection = createHeavyList(arrayList);
        System.out.println("Collection <300" + arrayList);
        System.out.println("Collection >300" + newCollection);
    }

    private static List<HeavyBox> createHeavyList(List<HeavyBox> arrayList) {
        List<HeavyBox> result = new ArrayList<>();
        Iterator<HeavyBox> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            HeavyBox box = iterator.next();
            if (box.weight > 300) {
                iterator.remove();
                result.add(box);
            }
        }
        return result;
    }
}
