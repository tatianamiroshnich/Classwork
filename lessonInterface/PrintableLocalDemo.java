package lessonInterface;

import lessonInterface.Printable;

/**
 * Created by student on 13.06.2018.
 */
public class PrintableLocalDemo {
    public static void main(String[] args) {
        Printable printable = new Printable() {
            @Override
            public void print() {
                System.out.println("Anonymous class");
            }
        };
        printable.print();
    }

}
