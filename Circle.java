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

    public static void main(String[] args) {
        Shape [] shapes = new Shape[2];

        shapes[0] = new Circle("red ",5,4);
        shapes[1] = new Circle("yellow ",4,4);

        for (Shape shape:shapes){
            shape.draw();
        }
    }
}
