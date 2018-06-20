package lesson16task6;

import java.util.Comparator;

/**
 * Created by student on 20.06.2018.
 */
public class NameComparator implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
