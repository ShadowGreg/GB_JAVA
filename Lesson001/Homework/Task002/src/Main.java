import java.util.ArrayList;

//Task2
//        Реализуйте алгоритм сортировки пузырьком для сортировки массива


public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = GenerateRandomArray(0, 300);
        System.out.println("Сгенерированный масиив:");
        PrintArray(arrayList);
        System.out.println("Сортированный массив:");
        PrintArray(SortBubbleMethod(arrayList));

    }

    private static ArrayList<Integer> SortBubbleMethod(ArrayList<Integer> arrayList) {
        ArrayList<Integer> sortedArray = new ArrayList<>(arrayList);
        for (int i = 0; i < sortedArray.size() - 1; i++) {
            for (int j = 0; j < sortedArray.size() - i - 1; j++) {
                if (sortedArray.get(j + 1) < sortedArray.get(j)) {
                    int swap = sortedArray.get(j);
                    sortedArray.set(j, sortedArray.get(j + 1));
                    sortedArray.set((j + 1), swap);
                }
            }
        }
        return sortedArray;
    }

    private static ArrayList<Integer> GenerateRandomArray(Integer min, Integer max) {
        ArrayList<Integer> output = new ArrayList<Integer>();

        for (int i = 0; i < GetRandomNum(min, max); i++) {
            output.add(GetRandomNum(min, max));
        }
        return output;
    }

    private static Integer GetRandomNum(Integer min, Integer max) {
        int range = Math.abs(max - min) + 1;
        return ((int) (Math.random() * range) + (min <= max ? min : max));
    }

    private static void PrintArray(ArrayList<Integer> newArrayList) {
        newArrayList.forEach(s -> System.out.print(s + " , "));
        System.out.println();
    }
}