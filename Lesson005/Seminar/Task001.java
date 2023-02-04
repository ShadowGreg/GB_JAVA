import java.util.Arrays;
import java.util.List;

public class Task001 {
    public static void main(String[] args) {
        List<Integer> array = Arrays.asList(1, 1, 1, 2, 2, 3, 3, 5);
        System.out.println(array);
        System.out.println(getNumberOfCouples(array));

    }

    public static Integer getNumberOfCouples(final List<Integer> list) {
        Integer outCount = 0;
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) == list.get(j)) {
                    outCount++;
                }
            }

        }
        return outCount;
    }
}
