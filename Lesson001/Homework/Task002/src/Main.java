import java.util.ArrayList;

//Task2
//        Реализуйте алгоритм сортировки пузырьком для сортировки массива


public class Main extends RandomArray.Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = generateRandomArray(0, 300);
        System.out.println("Сгенерированный масиив:");
        Service.printArray(arrayList);
        System.out.println("Сортированный массив:");
        Service.printArray(BubbleMethod.sortBubbleMethod(arrayList));

    }

}