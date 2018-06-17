package lesson16;

/**
 * Created by student on 6/17/2018.
 */
public class Box6 {
    double width;
    double height;
    double depth;

    Box6(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    public Box6() {
        width = -1;  // используем -1 для
        height = -1; // обозначения непроинициализированной
        depth = -1;  // коробки
    }

    Box6(double len) {
        width = len;
        height = len;
        depth = len;
    }

    // подсчитать объем коробки
    double getVolume() {
        return width * height * depth;
    }
}
