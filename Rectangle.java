import java.util.Objects;

public class Rectangle extends Shape {
    int x, y;

    public Rectangle(String color, int x, int y) {
        super(color);
        this.x = x;
        this.y = y;
    }

    public Rectangle(int x, int y) {
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
        System.out.println("Рисуем прямоугольник " + getColor() + "с координатами " + getX() + ", " + getY());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Rectangle rectangle = (Rectangle) o;
        return x == rectangle.x &&
                y == rectangle.y;
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), x, y);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "x=" + x +
                ", y=" + y +
                "} " + super.toString();
    }

    public static void main(String[] args) {
        Shape [] shapes = new Shape[2];

        shapes[0] = new Rectangle("blue ",5,5);
        shapes[1] = new Rectangle("blue ",5,5);

        System.out.println(shapes[0].equals(shapes[1]));
        System.out.println(shapes[1]);

        for (Shape shape:shapes){
            shape.draw();
        }
    }
}
