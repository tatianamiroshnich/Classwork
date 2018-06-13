

public class Book implements Printable {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Book(String name) {
        this.name = name;
    }

    public Book() {
    }

    @Override
    public void print() {
        System.out.println("Печатаю книгу " + getName());
    }

    public static void printBook(Printable[] array) {
        for (Printable printable : array) {
            if (printable instanceof Book) {
                System.out.println(printable);
            }
        }

    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Book book1 = new Book("Name1");
        Book book2 = new Book("Name2");
        Magazine magazine1 = new Magazine("Name3", 2);

        Printable[] printables = {book1, book2, magazine1};

        for (Printable printable : printables) {
            printable.print();
        }

        System.out.println();
        Book.printBook(printables);
        System.out.println();
        Magazine.printMagazines(printables);
    }
}
