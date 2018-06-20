package lesson16;

/**
 * Created by student on 6/17/2018.
 */
public class HeavyBox extends Box6 implements Comparable<HeavyBox> {
    public int weight; // вес коробки

    public HeavyBox(int width, int height, int depth, int weight) {
        super(width, height, depth);
        this.weight = weight;
    }

    public HeavyBox() {
        this.weight = -1;
    }

    @Override
    public String toString() {
        return "HeavyBox{" +
                "weight=" + weight +
                "} ";
    }

    @Override
    public int compareTo(HeavyBox o) {
        return this.weight - o.weight;
    }
}


