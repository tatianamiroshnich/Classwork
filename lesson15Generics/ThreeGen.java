package lesson15Generics;

import java.io.Serializable;

/**
 * Created by student on 13.06.2018.
 */
public class ThreeGen<T extends Comparable, V extends Animal & Serializable, K extends Number> {
    private T ob1;
    private V ob2;
    private K ob3;

    ThreeGen(T o1, V o2, K o3) {
        ob1 = o1;
        ob2 = o2;
        ob3 = o3;
    }

    T getOb1() {
        return ob1;
    }

    V getOb2() {
        return ob2;
    }

    K getOb3() {
        return ob3;
    }
}
