import java.util.Dictionary;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String jewels = "aBCDGH";
        String stones = "aaaAbbbBCsdfsAdfgsdfASDSDFASXCVBXCVBDSFGHSDFGSDFAWEASGJRYJYUYUJYJDFHDGFAWEFWEFAWFASCDDFF";
        System.out.println(findJewelsInStones(jewels, stones));
        System.out.println(findJewelsInStonesDic(jewels, stones));
    }

    public static String findJewelsInStones(String jewels, String stones) {
        long startTime = System.nanoTime();
        String outputResult = "";
        int counter = 0;
        for (int i = 0; i < jewels.length(); i++) {
            for (int j = 0; j < stones.length(); j++) {
                if (jewels.charAt(i) == stones.charAt(j)) {
                    counter++;
                }

            }
            outputResult = outputResult + jewels.charAt(i) + counter;
            counter = 0;
        }
        long endTime = System.nanoTime();
        System.out.println((endTime - startTime) / 1000000 + "ms");
        return outputResult;
    }

    public static Map<Character, Integer> findJewelsInStonesDic(String jewels, String stones) {
        long startTime = System.nanoTime();
        Map<Character, Integer> outputResult = new HashMap<>();
        for (int i = 0; i < jewels.length(); i++) {
            outputResult.put(jewels.charAt(i), 0);
        }

        for (int i = 0; i < stones.length(); i++) {
            if (outputResult.containsKey(stones.charAt(i))) {
                int temp = outputResult.get(stones.charAt(i));
                outputResult.put(stones.charAt(i), ++temp);
            }
        }

        long endTime = System.nanoTime();
        System.out.println((endTime - startTime) / 1000000 + "ms");
        return outputResult;
    }
}