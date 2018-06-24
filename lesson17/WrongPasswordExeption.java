package lesson17;

/**
 * Created by student on 6/24/2018.
 */
public class WrongPasswordExeption extends Exception {
    public WrongPasswordExeption(String message){
        super(message);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
