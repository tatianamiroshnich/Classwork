package lesson16task6;

import java.util.Comparator;

/**
 * Created by student on 20.06.2018.
 */
public class RateComparator implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        if (o1.getRate() > o2.getRate()) {
            return -1;
        } else if (o1.getRate() < o2.getRate()) {
            return 1;
        }
        return 0;
    }
}
