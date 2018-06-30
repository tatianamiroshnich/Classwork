package lesson19;

import java.io.Serializable;

/**
 * Created by student on 30.06.2018.
 */
public class Horse extends Animal implements Serializable {
    private String color;

    public Horse(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
