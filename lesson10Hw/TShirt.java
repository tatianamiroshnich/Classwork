package lesson10Hw;

/**
 * Created by student on 6/3/2018.
 */
public class TShirt extends Clothes implements ManClothes,WomanClothes {
    public TShirt(Size size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void wearMan() {
        System.out.println("Одеваю на мужчину " + this);
    }

    @Override
    public void wearWoman() {
        System.out.println("Одеваю на женщину " + this);
    }

    @Override
    public String toString() {
        return "TShirt{} " + super.toString();
    }
}
