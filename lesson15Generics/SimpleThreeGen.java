package lesson15Generics;

/**
 * Created by student on 13.06.2018.
 */
public class SimpleThreeGen {
    public static void main(String[] args) {
        ThreeGen<String, Animal, Double> tgObj = new ThreeGen<>( "Generics",new Animal(),56.6);

        String v = tgObj.getOb1();
        System.out.println("value: " + v);

        Animal dog = tgObj.getOb2();
        System.out.println("value: " + dog);

        double d = tgObj.getOb3();
        System.out.println("value: " + d);
    }
}
