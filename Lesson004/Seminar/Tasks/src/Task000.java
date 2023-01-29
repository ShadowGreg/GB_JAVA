import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Task000 {
    public static void main(String[] args) {
        Deque<Integer> d1 = new ArrayDeque<>(Arrays.asList(1, 2, 3));
        Deque<Integer> d2 = new ArrayDeque<>(Arrays.asList(5, 4, 7));
        System.out.println(getDequeSum(d1, d2));

    }

    private static Deque<Integer> getDequeSum(Deque<Integer> d1, Deque<Integer> d2) {
        Deque<Integer> result = new ArrayDeque<>();
        while (!d1.isEmpty() && !d2.isEmpty()) {
            if (d1.getFirst() + d2.getFirst() < 9) {
                result.addLast(d1.removeFirst() + d2.removeFirst());

            } else if ((d1.getFirst() + d2.getFirst()) > 9) {
                result.addLast((d1.getFirst() + d2.getFirst()) % 10);
                result.addLast((d1.getFirst() + d2.getFirst()) / 10);
                d1.removeFirst();
                d2.removeFirst();
            }
        }
        while (!d1.isEmpty()) result.addFirst(d1.removeFirst());
        while (!d2.isEmpty()) result.addFirst(d2.removeFirst());
        return result;

    }
}