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

    public static void main(String[] args) {
        Shape [] shapes = new Shape[2];

        shapes[0] = new Rectangle("blue ",5,5);
        shapes[1] = new Rectangle("green ",3,4);

        for (Shape shape:shapes){
            shape.draw();
        }
    }
}
