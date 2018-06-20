package lesson16task6;

import java.util.Set;

/**
 * Created by student on 20.06.2018.
 */
public class Category {
    private String name;
    private Set<Product> set;

    public Category(String name, Set<Product> set) {
        this.name = name;
        this.set = set;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Product> getSet() {
        return set;
    }

    public void setSet(Set<Product> set) {
        this.set = set;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Category)) return false;

        Category category = (Category) o;

        if (name != null ? !name.equals(category.name) : category.name != null) return false;
        return set != null ? set.equals(category.set) : category.set == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (set != null ? set.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Category{" +
                "name='" + name + '\'' +
                ", set=" + set +
                '}';
    }
}
