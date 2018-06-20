package lesson16task6;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by student on 20.06.2018.
 */
public class CategoryDemo {
    public static void main(String[] args) {
        Product product1 = new Product("pineapple", 10.5, 5);
        Product product2 = new Product("peach", 5.5, 4);
        Product product3 = new Product("apple", 2.5, 1);

        Set<Product> set = new HashSet<>();
        set.add(product1);
        set.add(product2);
        set.add(product3);

        Category category = new Category("fruit", set);

        print(set, new PriceComparator());
        print(set, new NameComparator());
        print(set, new RateComparator());
    }

    public static void print(Set<Product> set, Comparator<Product> comparator) {
        Set<Product> newSet = new TreeSet<>(new RateComparator());
        newSet.addAll(set);

        System.out.println(newSet);
    }
}

