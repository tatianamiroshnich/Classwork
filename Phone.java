public class Phone {
    String number;
    String model;
    double weight;

    public Phone(String number, String model, double weight) {
        this(number, model);
        this.weight = weight;
    }

    Phone(String number, String model){
        this();
        this.model = model;
    }

    Phone(){}

    /*void setDim(String n, String m, double w) {
        number = n;
        model = m;
        weight = w;
    }*/

    void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    String getNumber() {
        return number;
    }
}
