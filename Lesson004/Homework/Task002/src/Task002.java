import java.util.*;

public class Task002 {
    public static void main(String[] args) {
        Deque<String> bracketMask = new ArrayDeque<>(Arrays.asList("()", "[]", "{}"));
        List<String> testTexts = new ArrayList<>();
        testTextsCombine(testTexts);

        for (String textItem : testTexts) {
            System.out.println(textItem + " = " + isBracketsCorrect(textItem, bracketMask));
        }


    }

    private static void testTextsCombine(List<String> testTexts) {
        String text1 = "()[]";
        testTexts.add(text1);
        String text2 = "()";
        testTexts.add(text2);
        String text3 = "{[()]}";
        testTexts.add(text3);
        String text4 = "()()";
        testTexts.add(text4);
        String text5 = ")()(";
        testTexts.add(text5);
        String text6 = "[]{([()])}";
        testTexts.add(text6);
        String text7 = "[])({([()])}";
        testTexts.add(text7);
    }

    private static boolean isBracketsCorrect(String text, Deque<String> inputBracketMask) {
        Deque<String> bracketMask = new ArrayDeque<>(inputBracketMask);
        String localText = text;

        while (areAnyCoincidences(localText, bracketMask)) {
            for (String textKey : bracketMask) {
                localText = localText.replace(textKey, "");
            }
        }
        if (localText.length() > 0)
            return false;
        return true;
    }

    private static boolean areAnyCoincidences(String localText, Deque<String> bracketMask) {
        Deque<String> localDeque = new ArrayDeque<>(bracketMask);
        for (String item : localDeque) {
            if (localText.contains(item)) {
                return true;
            }
        }
        return false;
    }
}
