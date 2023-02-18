import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        User[] users = new User[]{
                new User("Bill", "Klinton", 98),
                new User("Monika", "Livinsky", 48),
                new User("Monika", "Livinsky", 68),
                new User("Bill", "Gatse", 86),
                new User("Tom", "Kruse", 98),
                new User("Chipollino", "Radary", 198)
        };

        Personal personal = new Personal(users);

        for (User user : personal) {
            System.out.println(user);
        }

        List<User> myUsers = personal.toList();

        Collections.sort(myUsers);

        System.out.println(myUsers);

    }
}