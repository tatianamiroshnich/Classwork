/**
 * Created by student on 5/20/2018.
 */
public class StudentDemo {
    public static void main(String[] args) {
        Student student = new Student("Ivan", "Ivanov", "Kit", 5);
        Aspirant aspirant1 = new Aspirant("Petr", "Petrov", "Rit ", 5, "Progrmming");
        Student aspirant2 = new Aspirant("Pedro", "Pe", "Lit ", 4, "Medicine");

        Student[] students = {student, aspirant1, aspirant2};

        for (Student s : students) {
            System.out.print(s.getLastName() + " " + s.getFirstName() + " ");
            System.out.println(s.getScholarShip());
        }
    }
}
