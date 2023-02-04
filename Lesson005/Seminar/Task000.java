import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task000 {
    public static void main(String[] args) {
        Task000 task001 = new Task000();
        Integer maxCount = 10;
        List<Integer> integerList = task001.fillArray(maxCount);

        System.out.println(task001.getSumOfUniqueValues(integerList));
    }

    public Integer getSumOfUniqueValues(final List<Integer> list) {
        Integer outputSUM = 0;
        Map<Integer,Integer> countMap = fillMap(list);

        for (Integer item : countMap.keySet()) {
            if (countMap.get(item) == 1){
                outputSUM = outputSUM + item;
                System.out.println("keys: "+item);

            }
        }

        return outputSUM;
    }

    private Map fillMap(List<Integer> list) {
        Map outputMap = new HashMap();
        for (Integer item : list) {
            Integer count = 1;
            if (outputMap.containsKey(item)) {
                outputMap.put(item, ++count);
            } else {
                outputMap.put(item, count);
            }
        }
        return outputMap;
    }

    private List<Integer> fillArray(int size) {
        int degree = 10;
        List<Integer> tempList = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            int randomNum = (int) (Math.random() * degree);
            tempList.add(randomNum);
        }
        System.out.println(tempList);
        return tempList;
    }

}
