import java.util.ArrayList;

//Task2
//        Реализуйте алгоритм сортировки пузырьком для сортировки массива


public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = generateRandomArray(0, 300);
        System.out.println("Сгенерированный масиив:");
        printArray(arrayList);
        System.out.println("Сортированный массив:");
        printArray(sortBubbleMethod(arrayList));

    }

    private static ArrayList<Integer> sortBubbleMethod(ArrayList<Integer> arrayList) {
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

    private static void printArray(ArrayList<Integer> newArrayList) {
        newArrayList.forEach(s -> System.out.print(s + " , "));
        System.out.println();
    }
}