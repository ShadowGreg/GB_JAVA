import java.util.Iterator;

public class Student implements Iterator {
    private String name;
    private String email;
    private int index = 0;


    public Student(String name, String email) {
        this.name = name;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public boolean hasNext() {
        return index++ < 2;
    }

    @Override
    public Object next() {
        switch (index) {
            case 1:
                return String.format("Name: %s", name);
            case 2: {
                return String.format("Email: %s", email);
            }
            default:
                return null;
        }
    }
}
