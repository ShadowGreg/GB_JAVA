//Заполните массив случайным числами и выведите максимальное, минимальное и среднее значение.
//        Для генерации случайного числа используйте метод Math.random(), который возвращает значение в промежутке [0, 300].

import java.util.ArrayList;
import java.util.Collections;



public class Task004 {
    public static void main(String[] args) {
        ArrayList<Integer> newArrayList = new ArrayList<Integer>();
        newArrayList = GenerateRandomArray(0, 300);
        PrintArray(newArrayList);
        System.out.println("Максимум > " + Collections.max(newArrayList));
        System.out.println("Минимум > " + Collections.min(newArrayList));
        System.out.println("Среднее > " + (Collections.max(newArrayList) + Collections.min(newArrayList)) / 2);
        System.out.println("Элемент в середине > " + FindMiddle(newArrayList));
    }

    private static void PrintArray(ArrayList<Integer> newArrayList) {
        newArrayList.forEach(s -> System.out.print(s + " , "));
        System.out.println();
    }

    private static Integer FindMiddle(ArrayList<Integer> newArrayList) {
        int middle = newArrayList.size() / 2;
        return newArrayList.get(middle);
    }

    private static ArrayList<Integer> GenerateRandomArray(Integer min, Integer max) {
        ArrayList<Integer> output = new ArrayList<Integer>();
        int range = Math.abs(max - min) + 1;
        for (int i = 0; i < ((int)(Math.random() * range) + (min <= max ? min : max)); i++) {
            output.add((int)(Math.random() * range) + (min <= max ? min : max));
        }
        return output;
    }

}
