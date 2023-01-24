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

    public static String findJewelsInStonesDic(String jewels, String stones) {
        long startTime = System.nanoTime();
        Map<Character, Integer> outputMap = new HashMap<>();
        String outputResult = "";
        for (int i = 0; i < jewels.length(); i++) {
            outputMap.put(jewels.charAt(i), 0);
        }

        for (int i = 0; i < stones.length(); i++) {
            if (outputMap.containsKey(stones.charAt(i))) {
                int temp = outputMap.get(stones.charAt(i));
                outputMap.put(stones.charAt(i), ++temp);
            }
        }
        for (var entry : outputMap.entrySet()) {
            outputResult = new StringBuilder(outputResult + entry.getKey() + entry.getValue()).toString();
        }

        long endTime = System.nanoTime();
        System.out.println((endTime - startTime) / 1000000 + "ms");
        return outputResult;
    }
}