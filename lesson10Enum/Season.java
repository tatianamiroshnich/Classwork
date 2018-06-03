package lesson10Enum;

/**
 * Created by student on 6/3/2018.
 */
public enum Season {
    WINTER(-15.0), SPRING(20), SUMMER(+35) {
        public String getDescription() {
            return " Теплое время года";
        }
    }, AUTUMN(15);
    private double temp;

    Season(double temp) {
        this.temp = temp;
    }

    public double getTemp() {
        return temp;
    }

    public String getDescription() {
        return " Холодное время года";
    }
}
