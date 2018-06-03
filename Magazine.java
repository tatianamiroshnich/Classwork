public class Magazine implements Printable {
    private String name;
    private int number;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Magazine(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public Magazine() {
    }

    @Override
    public void print() {
        System.out.println("Печатаю журнал " + getName() + " випуск №" + getNumber());

    }

    public static void printMagazines(Printable[] array) {
        for (Printable printable: array){
            if (printable instanceof Magazine){
                System.out.println(printable);
            }
        }

    }

    @Override
    public String toString() {
        return "Magazine{" +
                "name='" + name + '\'' +
                ", number=" + number +
                '}';
    }
}
