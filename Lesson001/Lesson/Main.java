import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String inputName = getName();
        System.out.printf("Привет %s!", inputName);

    }
    public static String getName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите Имя: > ");
        String name = scanner.nextLine();

        return name;
    }
}
