import java.util.Scanner;

//В консоли запросить имя пользователя. В зависимости от текущего времени, вывести приветствие вида
//"Доброе утро, <Имя>!", если время от 05:00 до 11:59
//"Добрый день, <Имя>!", если время от 12:00 до 17:59;
//"Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
//"Доброй ночи, <Имя>!", если время от 23:00 до 4:59
public class Task002 {
    public static void main(String[] args) {

        System.out.println(GetMeeting(GetTimeFromUser()) + " " + Main.getName() + "!");

    }

    public static String[] GetTimeFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите час: > ");
        String hour = scanner.nextLine();
        System.out.print("Введите Минуты: > ");
        String minute = scanner.nextLine();
        return new String[]{hour, minute};
    }

    public static String GetMeeting(String[] inputTime) {
        String outputWord = new String();
        if (Integer.parseInt(inputTime[0]) >= 5 && Integer.parseInt(inputTime[0]) < 12) {
            outputWord = "Доброе утро,";
        }
        if (Integer.parseInt(inputTime[0]) >= 12 && Integer.parseInt(inputTime[0]) < 18) {
            outputWord = "Добрый день,";
        }
        if (Integer.parseInt(inputTime[0]) >= 18 && Integer.parseInt(inputTime[0]) < 23) {
            outputWord = "Добрый вечер,";
        }
        if ((Integer.parseInt(inputTime[0]) >= 23 && Integer.parseInt(inputTime[0]) <= 24) ||
                (Integer.parseInt(inputTime[0]) >= 0 && Integer.parseInt(inputTime[0]) < 5)) {
            outputWord = "Доброй ночи,";
        }
        return outputWord;
    }
}
