import java.util.ArrayList;
import java.util.Collections;

//Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести максимальное количество подряд идущих 1.
public class Task003 {
    public static void main(String[] args) {
        int[] array = new int[]{1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 1};
        System.out.println(GetQuantityOne(array));
    }

    private static Integer GetQuantityOne(int[] array) {
        ArrayList<Integer> countArray = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                count++;
            }
            if (array[i] == 0) {
                countArray.add(count);
                count = 0;
            }
            if (i == array.length - 1) {
                countArray.add(count);
            }

        }
        return Collections.max(countArray);
    }
}
