package lesson16;

import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Created by student on 6/17/2018.
 */
public class TreeSetDemo {
    public static void main(String[] args) {
        SortedSet<HeavyBox> set = new TreeSet<>();
        set.add(new HeavyBox(2, 6, 4, 9));
        set.add(new HeavyBox(2, 4, 7, 8));
        set.add(new HeavyBox(2, 5, 4, 11));
        set.add(new HeavyBox(2, 6, 0, 3));

        for (HeavyBox box : set) {
            System.out.println(box);
        }

    }
}
