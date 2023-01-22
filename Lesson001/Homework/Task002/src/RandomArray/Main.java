package RandomArray;

import java.util.ArrayList;

public class Main extends Service {
    protected static ArrayList<Integer> generateRandomArray(Integer min, Integer max) {
        ArrayList<Integer> output = new ArrayList<Integer>();

        for (int i = 0; i < getRandomNum(min, max); i++) {
            output.add(getRandomNum(min, max));
        }
        return output;
    }
}
