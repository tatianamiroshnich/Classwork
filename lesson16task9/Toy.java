package lesson16task9;

/**
 * Created by student on 20.06.2018.
 */
public class Toy {
    private String name;
    private int cost;

    public Toy(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Toy)) return false;

        Toy toy = (Toy) o;

        if (cost != toy.cost) return false;
        return name != null ? name.equals(toy.name) : toy.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + cost;
        return result;
    }

    @Override
    public String toString() {
        return "Toy{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                '}';
    }
}
