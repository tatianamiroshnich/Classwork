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

    @Override
    public void print() {
        System.out.println("Печатаю журнал " + getName() + " випуск №" + getNumber());

    }
}
