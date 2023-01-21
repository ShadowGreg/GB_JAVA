//Task1
//        Заполните массив случайным числами и выведите максимальное, минимальное и среднее значение.
//
//        Для генерации случайного числа используйте метод Math.random(), который возвращает значение в промежутке [0, 300].

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> newArrayList;
        newArrayList = generateRandomArray(0, 300);
        printArray(newArrayList);
        System.out.println("Максимум > " + Collections.max(newArrayList));
        System.out.println("Минимум > " + Collections.min(newArrayList));
        System.out.println("Среднее > " + (Collections.max(newArrayList) + Collections.min(newArrayList)) / 2);
        System.out.println("Элемент в середине > " + findMiddle(newArrayList));

    }

    private static void printArray(ArrayList<Integer> newArrayList) {
        newArrayList.forEach(s -> System.out.print(s + " , "));
        System.out.println();
    }

    private static Integer findMiddle(ArrayList<Integer> newArrayList) {
        int middle = newArrayList.size() / 2;
        return newArrayList.get(middle);
    }

    private static ArrayList<Integer> generateRandomArray(Integer min, Integer max) {
        ArrayList<Integer> output = new ArrayList<Integer>();

        for (int i = 0; i < getRandomNum(min, max); i++) {
            output.add(getRandomNum(min, max));
        }
        return output;
    }

    private static Integer getRandomNum(Integer min, Integer max) {
        int range = Math.abs(max - min) + 1;
        return ((int) (Math.random() * range) + (min <= max ? min : max));
    }

}