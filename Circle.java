import java.util.Objects;

public class Circle extends Shape {
    private int x,y;

    public Circle(String color, int x, int y) {
        super(color);
        this.x = x;
        this.y = y;
    }

    public Circle(int x, int y) {
        super("red");
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public void draw() {
        System.out.println("Рисуем круг " + getColor() + "с координатами " + getX() + ", " + getY());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Circle circle = (Circle) o;
        return x == circle.x &&
                y == circle.y;
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), x, y);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "x=" + x +
                ", y=" + y +
                "} " + super.toString();
    }

    public static void main(String[] args) {
        Shape [] shapes = new Shape[2];

        shapes[0] = new Circle("red ",5,4);
        shapes[1] = new Circle("yellow ",4,4);

        System.out.println(shapes[0].equals(shapes[1]));
        System.out.println(shapes[0]);

        for (Shape shape:shapes){
            shape.draw();
        }
    }
}
