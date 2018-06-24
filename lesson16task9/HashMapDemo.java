package lesson16task9;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by student on 20.06.2018.
 */
public class HashMapDemo {
    public static void main(String[] args) {
        Map<String, Toy> map = new HashMap<>();
        map.put("Cube", new Toy("Cube", 15));
        map.put("Doll", new Toy("Doll", 35));
        map.put("Teddy Bear", new Toy("Teddy Bear", 25));

        printByEntrySet(map);
        printByKeys(map);
        printByValues(map);
    }

    public static void printByEntrySet(Map<String, Toy> map) {
        Set<Map.Entry<String, Toy>> entries = map.entrySet();
        for (Map.Entry<String, Toy> entry:entries){
            System.out.print("Key: " + entry.getKey());
            System.out.println("; Value: " + entry.getValue());
        }
    }

    public static void printByKeys(Map<String, Toy> map){
        Set<String> keys = map.keySet();
        for (String key : keys){
            System.out.println(key);
        }
    }

    public static void printByValues(Map<String,Toy>map){
        Collection<Toy> values = map.values();
        for (Toy toy : values){
            System.out.println(toy);
        }
    }

}
