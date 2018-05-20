public class Phone {
    String model;
    double weight;
    private static int count = 0;
    private String number = "none";

    public Phone(String number, String model, double weight) {
        this.weight = weight;
        count++;
    }

    Phone(String number) {
        this.number = number;
        count++;
    }

    Phone() {
        count++;
    }

    void setDim(String n, String m, double w) {
        number = n;
        model = m;
        weight = w;
    }

    void receiveCall(String name) {

        System.out.println("Звонит " + name);
    }

    String getNumber() {

        return number;
    }

    static int getCountInstance() {
        return count;
    }

    protected void finalize() {
        System.out.println("In finalize");
        count--;
    }
}
