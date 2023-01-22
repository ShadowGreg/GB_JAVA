import java.util.Arrays;
import java.util.Scanner;

import java.util.Random;

//Task2
//        Пользователь должен указать с клавиатуры чётное положительное число,
//        а программа должна создать массив указанного размера из случайных
//        целых чисел из [-5;5] и вывести его на экран в строку.
//        После этого программа должна определить и сообщить пользователю о том,
//        сумма модулей какой половины массива больше: левой или правой, либо сообщить,
//        что эти суммы модулей равны. Если пользователь введёт неподходящее число,
//        то программа должна требовать повторного ввода до тех пор,
//        пока не будет указано корректное значение.
public class Main {
    public static void main(String[] args) {
        sumModulesHalvesArray(generateArray(readArrayLengt()));
    }

    private static void sumModulesHalvesArray(Integer[] generateArray) {
        int leftABSSum = 0;
        int rightABSSum = 0;
        for (int i = 0; i < generateArray.length / 2; i++) {
            leftABSSum = leftABSSum + Math.abs(generateArray[i]);
            rightABSSum = rightABSSum + Math.abs(generateArray[generateArray.length - 1 - i]);
        }
        if (leftABSSum > rightABSSum ){
            System.out.println("Сумма модулей левой половина массива больше правой половины массива");
        }
        else if (leftABSSum < rightABSSum) {
            System.out.println("Сумма модулей правой половина массива больше левой половины массива");

        } else {
            System.out.println("Сумма модулей правой и левой половин массива равны друг другу");
        }

    }

    private static Integer[] generateArray(Integer readArrayLengt) {
        Random rnd = new Random();
        Integer[] array = new Integer[readArrayLengt];
        Integer MAX = 5;
        Integer MIN = -5;
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt((MAX - MIN) + 1) + MIN;
        }
        System.out.println("Массив: " + Arrays.toString(array));
        return array;
    }

    private static Integer readArrayLengt() {
        Boolean flag = true;
        Scanner scanner = new Scanner(System.in);
        int len = 0;
        while (flag) {
            System.out.print("Введите чётное положительное число > ");
            len = scanner.nextInt();
            if (len > 0 && len % 2 == 0) {
                flag = false;
            }
        }
        return len;
    }
}