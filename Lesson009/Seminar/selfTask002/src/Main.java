import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);

        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println();

        List<Student> students = List.of(
                new Student("Ivan", "Ivan@mail.ru"),
                new Student("Ilya", "Ilya@mail.ru"),
                new Student("Semion", "Semion@mail.ru"),
                new Student("Semion", "Ivan@mail.ru")
        );

        Iterator<Student> studentsIt = students.iterator();
        while (studentsIt.hasNext()) {
            System.out.println(studentsIt.next());
        }

        System.out.println();

        Student Ivan = new Student("Ivan", "Ivan@mail.ru");
//        Iterator<Object> fields = Ivan.iterator();
        while (Ivan.hasNext()) {
            System.out.println(Ivan.next());
        }

        System.out.println();

        Student Nikolay = new Student("Nikolay", "Nikolay@mail.ru");
        Iterator<String> fields = Nikolay;
        while (fields.hasNext()){
            System.out.println(fields.next());
        }
        System.out.println();
        while (fields.hasNext()){
            System.out.println(fields.next());
        }

    }
}