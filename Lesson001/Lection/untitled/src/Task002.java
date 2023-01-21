//        Даны два файла, в каждом из которых находится запись
//        многочлена. Сформировать файл содержащий сумму
//        многочленов.

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Task002 {

    public static void main(String[] args) throws IOException {
        StringBuilder firstPolynomial = new StringBuilder(GetTextFromFile("src/firstPolynomial.txt"));
        StringBuilder secondPolynomial = new StringBuilder(GetTextFromFile("src/secondPolynomial.txt"));

        GenerateSumFile(firstPolynomial, secondPolynomial);

    }

    static StringBuilder GetTextFromFile(String fileName) {
        File file = new File(fileName);
        StringBuilder outputText;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            outputText = new StringBuilder(reader.readLine());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return outputText;
    }

    private static void GenerateSumFile(StringBuilder firstPolynomial, StringBuilder secondPolynomial) throws IOException {
        Task001.WriteToFile("src/SumFile.txt", GetSum(firstPolynomial, secondPolynomial));
    }

    private static StringBuilder GetSum(StringBuilder firstPolynomial, StringBuilder secondPolynomial) {
        return GetSumElement(GetDictionaryElements(firstPolynomial), GetDictionaryElements(secondPolynomial));
    }

    private static Map<Integer, Integer> GetDictionaryElements(StringBuilder inputPolynomial) {
        Map<Integer, Integer> polynomialTerms = new HashMap<>();
        String textConvert = inputPolynomial.toString();
        ArrayList<String> firstLevelElements = new ArrayList<String>(List.of(textConvert.split(" ")));
        String[] removedElements = new String[]{"=", "+", "0"};
        firstLevelElements.removeAll(List.of(removedElements));

        for (String item : firstLevelElements) {
            if (isNumeric(item)) {
                polynomialTerms.put(0, Integer.parseInt(item));
            } else {
                if (item.contains("*x")) {
                    String[] tempItem = item.split("x");
                    if (tempItem.length == 2) {
                        polynomialTerms.put(Integer.parseInt(tempItem[1].replaceAll("\\D+", "")),
                                Integer.parseInt(tempItem[0].replaceAll("\\D+", "")));
                    } else {
                        polynomialTerms.put(1,
                                Integer.parseInt(tempItem[0].replaceAll("\\D+", "")));
                    }
                }
            }
        }
        return polynomialTerms;
    }

    private static boolean isNumeric(String str) {
        return str.matches("-?\\d+(\\.\\d+)?");  //match a number with optional '-' and decimal.
    }

    private static StringBuilder GetSumElement(Map<Integer, Integer> firstInputPolynomial,
                                               Map<Integer, Integer> secondInputPolynomial) {
        Set<Integer> firstKeyArray = firstInputPolynomial.keySet();
        Set<Integer> secondKeyArray = secondInputPolynomial.keySet();
        Set<Integer> unionArray = merge(firstKeyArray, secondKeyArray);
        StringBuilder outputString = new StringBuilder(" = 0");
        for (Integer key : unionArray) {
            Integer temSum = firstInputPolynomial.get(key) + secondInputPolynomial.get(key);
            if (key == 0)
                outputString = new StringBuilder(temSum.toString() + outputString);
            if (key == 1)
                outputString = new StringBuilder(temSum.toString() + "*x + " + outputString);
            if (key != 1 && key != 0)
                outputString = new StringBuilder(temSum.toString() + "*x^" + key.toString() + " + " + outputString);
        }
        return outputString;
    }

    private static <T> Set<T> merge(Collection<? extends T>... collections) {
        Set<T> newSet = new HashSet<T>();
        for (Collection<? extends T> collection : collections)
            newSet.addAll(collection);
        return newSet;
    }
}