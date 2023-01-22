
//Task3
//        Создать двумерный массив из 5 строк по 8 столбцов в каждой из случайных
//        целых чисел из отрезка [-99;99].
//        Вывести массив на экран. После на отдельной строке вывести на экран
//        значение максимального элемента этого массива (его индекс не имеет значения).

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        findMAX(generateArray());
    }

    private static void findMAX(Integer[][] generateArray) {
        int max = 0;
        for (int i = 0; i < generateArray.length; i++) {
            for (int j = 0; j < generateArray[0].length; j++) {
                if (generateArray[i][j] > max) {
                    max = generateArray[i][j];
                }
            }

        }
        System.out.println();
        System.out.printf("Максимальный элемент этого массива равен %d", max);
    }

    private static Integer[][] generateArray() {
        int ROWS = 5;
        int COLLUMS = 8;
        Random rnd = new Random();
        Integer[][] array = new Integer[ROWS][COLLUMS];
        Integer MIN = -99;
        Integer MAX = 99;
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLLUMS; j++) {
                array[i][j] = rnd.nextInt((MAX - MIN) + 1) + MIN;
            }
        }
        printMatrix(array);
        return array;
    }

    private static void printMatrix(Integer[][] array) {
        System.out.println(Arrays.deepToString(array).replace("], ", "]\n"));
    }
}

