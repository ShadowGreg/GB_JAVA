import java.util.ArrayList;

public class Service extends BubbleMethod {
    protected static void PrintArray(ArrayList<Integer> newArrayList) {
        newArrayList.forEach(s -> System.out.print(s + " , "));
        System.out.println();
    }
}
