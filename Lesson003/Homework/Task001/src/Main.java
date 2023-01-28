import java.util.ArrayList;
import java.util.List;

public class Main {
    // Пусть дан произвольный список целых чисел
    public static void main(String[] args) {
        List<Integer> list = generateRandomList();
        System.out.print("Начинаем работу");
        System.out.println(" Исходный массив : " + list);
        System.out.println(" Удалим чётные : " + removeEvenValue(list));
        System.out.println(" Найдём минимум в исходном массиве : " + getMin(list) + ";");
        System.out.println(" Найдём максимум в исходном массиве : " + getMax(list) + ";");
        System.out.println(" Найдём среднее в исходном массиве : " + getAverage(list) + ";");
    }

    private static List<Integer> generateRandomList() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add((int) (Math.random() * 100));
        }
        return list;
    }

    // Нужно удалить из него четные числа
    public static List<Integer> removeEvenValue(List<Integer> list) {
        List<Integer> temp = new ArrayList<>();
        if (list.size() > 0) {
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) % 2 != 0) {
                    temp.add(list.get(i));
                }
            }
        }
        return temp;
    }

    // Найти минимальное значение
    public static Integer getMin(List<Integer> list) {
        if (list.size() > 0) {
            Integer min = list.get(0);
            for (int i = 1; i < list.size(); i++) {
                if (list.get(i) < min) {
                    min = list.get(i);
                }
            }
            return min;
        }
        return 0;
    }

    // Найти максимальное значение
    public static Integer getMax(List<Integer> list) {
        if (list.size() > 0) {
            Integer max = list.get(0);
            for (int i = 1; i < list.size(); i++) {
                if (list.get(i) > max) {
                    max = list.get(i);
                }
            }
            return max;
        }

        return 0;
    }

    // Найти среднее значение
    public static Integer getAverage(List<Integer> list) {
        if (list.size() > 0) {
            Integer sum = 0;
            for (int i = 0; i < list.size(); i++) {
                sum += list.get(i);
            }
            return sum / list.size();
        }
        return 0;
    }
}

