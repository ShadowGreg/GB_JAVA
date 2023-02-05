import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        int[] tempArray = m.initArray();
        //System.out.println(Arrays.toString(tempArray));
        System.out.format("процент уникальный чисел: %.2f",m.getPercentUniqueValues(tempArray));

    }

    public int[] initArray() {
        int COUNT = 1_000;
        int MAX = 24;
        int[] outArray = new int[COUNT];
        for (int i = 0; i < COUNT; i++) {
            outArray[i] = (int) (Math.random() * ((MAX)+1));
        }

        return outArray;
    }

    public double getPercentUniqueValues(int[] array){
        Set<Integer> tempSet = new HashSet<Integer>();
        for (int i = 0; i < array.length; i++) {
            tempSet.add(array[i]);
        }

        return tempSet.size()*100/array.length;
    }

}