import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Task001 {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>(Arrays.asList(1, 2, 3, 4, 5, 6, 6, 5, 4, 3, 2, 1));
        System.out.println(isPalindrome(deque));

    }

    public static boolean isPalindrome(Deque<Integer> deque) {
        int size = deque.size();
        for (int i = 0; i < size / 2; i++) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }
        return true;
    }
}
