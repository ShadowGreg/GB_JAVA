import java.util.ArrayList;

//Task2
//        Реализуйте алгоритм сортировки пузырьком для сортировки массива


public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = RandomNum.GenerateRandomArray(0, 300);
        System.out.println("Сгенерированный масиив:");
        Service.PrintArray(arrayList);
        System.out.println("Сортированный массив:");
        Service.PrintArray(BubbleMethod.SortBubbleMethod(arrayList));

    }

}