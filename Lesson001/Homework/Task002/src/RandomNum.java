import java.util.ArrayList;

public class RandomNum {
    static ArrayList<Integer> GenerateRandomArray(Integer min, Integer max) {
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
}
