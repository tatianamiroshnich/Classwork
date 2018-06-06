package lesson11;

/**
 * Created by student on 06.06.2018.
 */
public class DoubleDemo {
    public static void main(String[] args) {
        Double double1 = 7.5;
        Double double2 = new Double("7.8");
        Double double3 = 5.8;
        Double double4 = Double.valueOf("6.7");
        Double i5 = Double.parseDouble("1000");
        String d6 = Double.toString(5.67);

        System.out.println(double2);
        System.out.println(double3);
        System.out.println(double4);
        System.out.println(i5);
        System.out.println(d6);
        System.out.println();

        System.out.println(i5.shortValue());
        System.out.println(i5.byteValue());
        System.out.println(i5.longValue());
        System.out.println(i5.intValue());
        System.out.println(i5.floatValue());
        System.out.println(i5.doubleValue());

    }
}
