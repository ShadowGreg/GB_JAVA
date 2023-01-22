import java.util.ArrayList;

public class BubbleMethod {
    protected static ArrayList<Integer> SortBubbleMethod(ArrayList<Integer> arrayList) {
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
}
