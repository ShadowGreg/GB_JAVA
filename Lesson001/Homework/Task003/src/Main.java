import java.util.stream.IntStream;

//Task3
//        Напишите программу, которая выводит на консоль простые числа в промежутке от [2, 100].
//        Используйте для решения этой задачи оператор "%" (остаток от деления) и циклы.
public class Main {
    public static void main(String[] args) {
        int[] array = IntStream.range(2,200).toArray();

        printSimpleNumbers(array);
    }

    private static void printSimpleNumbers(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (isPrime(array[i])){
                System.out.print(array[i] + ", ");
            }
        }
    }

    private static boolean isPrime(int number) {
        return number > 1
                && IntStream.rangeClosed(2, (int) Math.sqrt(number))
                .noneMatch(n -> (number % n == 0));
    }
}