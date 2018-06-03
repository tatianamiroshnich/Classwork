package lesson10Hw;

/**
 * Created by student on 6/3/2018.
 */
public enum Size {
    XXS(32){
        public String getDescription(){
            return "Детский размер";
        }
    }, XS(34), S(36), M(38) ,L(40);

    private int euroSize;

    Size(int euroSize){
        this.euroSize = euroSize;
    }

    public int getEuroSize() {
        return euroSize;
    }

    public String getDescription(){
        return "Взрослый размер";
    }
}
