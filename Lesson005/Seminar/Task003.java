import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class Task003 {
    public static void main(String[] args) {
        String text = "Дана строка. Необходимо написать метод, который отсортирует слова в строке по длине с помощью TreeMap";
        TreeMap<Integer, List<String>> treeMap = getTreeMap(text);
        System.out.println(getSortedIncludesWords(treeMap));


    }

    private static TreeMap<Integer, List<String>> getTreeMap(String text) {
        String[] words = text.split(" ");
        TreeMap<Integer, List<String>> treeMap = new TreeMap<>();
        for (String word : words) {
            if (treeMap.containsKey(word.length())) {
                treeMap.get(word.length()).add(word);
            } else {
                ArrayList<String> temp = new ArrayList<>();
                temp.add(word);
                treeMap.put(word.length(), temp);
            }

        }
        return treeMap;
    }

    public static String getSortedIncludesWords(final TreeMap<Integer, List<String>> map){
        String outPut = "";
        for (List<String> item: map.values()){
            for (String word: item) {
                outPut += word + " ";
            }
        }

        return outPut;
    }

}
